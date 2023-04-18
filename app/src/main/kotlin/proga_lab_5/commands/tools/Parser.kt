package proga_lab_5.commands.tools

import proga_lab_5.city.CityCreator
import proga_lab_5.operator
import proga_lab_5.sc
import proga_lab_5.uPrinter
import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import java.time.LocalDate
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter


/**
 * Parser
 *
 * @constructor Create empty Parser
 */
class Parser {
    private val cityCreator = CityCreator()
    private var countLines : Int = 0

    /**
     * Parse
     *
     * @param path
     */
    fun parse(path:String){
        var counterCity = 0
        var file = """"""
        try{
            val bufferReader = BufferedReader(FileReader(path))
            while (bufferReader.readLine() != null){
                countLines += 1
            }
            val buf = BufferedReader(FileReader(path))
            while (countLines > 0){
                file += buf.readLine() + "\n"
                countLines -= 1
            }

            counterCity = count(file, "<City>")
            var counter = 0
            val lines = file.lines()

            while (counter != counterCity){
                for (i in lines.indices){
                    if (lines[i].contains("<City>")){
                        counter += 1
                        filterFields(lines[i+1], lines[i+2], lines[i+3], lines[i+4], lines[i+5], lines[i+6], lines[i+7], lines[i+8], lines[i+9], lines[i+10], lines[i+11])
                    }
                }
            }
        }catch (e : IOException){
            uPrinter.print { "Файла по указаному пути не найдено" }
            operator.runCommand(sc.nextLine())
        }
    }

    /**
     * Count
     *
     * @param str
     * @param target
     * @return
     */
    fun count(str: String, target: String): Int {
        return (str.length - str.replace(target, "").length) / target.length
    }
    private fun filterFields(name : String, coordX : String, coordY : String, area : String, population : String, meters : String, agl : String, climate : String, government : String, age: String, birthday : String){
        try {
            val slicedName = name.slice(7..name.length - 8)
            val slicedCoordX = coordX.slice(14..coordX.length - 15)
            val slicedCoordY = coordY.slice(14..coordY.length - 15)
            val slicedArea = area.slice(7..area.length - 8)
            val slicedPopulation = population.slice(13..population.length - 14)
            val slicedMeters = meters.slice(9..meters.length - 10)
            val slicedAgl = agl.slice(6..agl.length - 7)
            val slicedClimate = climate.slice(10..climate.length - 11)
            val slicedGovernment = government.slice(13..government.length - 14)
            val slicedAge = age.slice(6..age.length - 7)
            val slicedBirthday = birthday.slice(11..birthday.length - 12)

            val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            val date: LocalDate = LocalDate.parse(slicedBirthday, formatter)
            val result: ZonedDateTime = date.atStartOfDay(ZoneId.systemDefault())

            cityCreator.create(
                slicedName,
                slicedCoordX.toLong(),
                slicedCoordY.toFloat(),
                slicedArea.toInt(),
                slicedPopulation.toLong(),
                slicedMeters.toLong(),
                slicedAgl.toDouble(),
                slicedClimate,
                slicedGovernment,
                result,
                slicedAge.toInt()
            )
        }catch (e : Exception){
            uPrinter.print { "Ошибка в формате полей. Загрузка не выполнена." }
            operator.runCommand(sc.nextLine())
        }
    }
}