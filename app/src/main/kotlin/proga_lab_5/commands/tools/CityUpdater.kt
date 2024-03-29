package proga_lab_5.commands.tools

import proga_lab_5.city.*
import proga_lab_5.collection
import proga_lab_5.commands.Add
import proga_lab_5.commands.Var
import proga_lab_5.operator
import proga_lab_5.sc
import proga_lab_5.uPrinter
import java.time.ZonedDateTime

object Numbers {
    const val one = "1"
    const val two = "2"
    const val three = "3"
    const val four = "4"
    const val five = "5"
    const val six = "6"
    const val seven = "7"
    const val eight = "8"
    const val nine ="9"
    const val ten = "10"
    const val eleven = "11"
}

/**
 * City updater
 *
 * @constructor Create empty City updater
 */
class CityUpdater {

    private var varsShaper = VarsShaper()

    /**
     * Update city
     *
     * @param city
     * @param arguments
     */
    fun updateCity(city : City, arguments : HashMap<String, Any>) =
        if (arguments[Var.allFields] == "True" || arguments[Var.numberOfFields] == Numbers.eleven){
            fullUpdate(city)
        }else{
            for (i in 1..arguments[Var.numberOfFields].toString().toInt()){
                when (i.toString()){
                    Numbers.one -> update(city, arguments[Numbers.one].toString())
                    Numbers.two -> update(city, arguments[Numbers.two].toString())
                    Numbers.three -> update(city, arguments[Numbers.three].toString())
                    Numbers.four -> update(city, arguments[Numbers.four].toString())
                    Numbers.five -> update(city, arguments[Numbers.five].toString())
                    Numbers.six -> update(city, arguments[Numbers.six].toString())
                    Numbers.seven -> update(city, arguments[Numbers.seven].toString())
                    Numbers.eight -> update(city, arguments[Numbers.eight].toString())
                    Numbers.nine -> update(city, arguments[Numbers.nine].toString())
                    Numbers.ten -> update(city, arguments[Numbers.ten].toString())
                    else -> {
                        uPrinter.print{ "Ошибка при извлечении поле. Попробуйте ещё раз." }
                        operator.runCommand(sc.nextLine())
                    }
                }
            }
        }
    private fun fullUpdate(city : City){
        val cl = collection.getCollection()
        if (arrayFreeId.isNotEmpty()){
            arrayFreeId[arrayFreeId.lastIndex+1] = cl[0].getId()!!}
        else{
            arrayFreeId =  arrayOf(cl[0].getId()!!)
        }
        cl.remove(city)
        operator.runCommand(Add().getName())
    }
    private fun update(city : City, field : String){
        when (field) {
            Var.name -> city.setName(varsShaper.setName())
            Var.meters -> city.setMetersAboveSeaLevel(varsShaper.setMeters())
            Var.birthday -> city.setGovernorAge(ZonedDateTime.parse(varsShaper.setBirthday()))
            Var.coordinateX -> city.setCoordinatesX(varsShaper.setCoordX())
            Var.coordinateY -> city.setCoordinatesY(varsShaper.setCoordY())
            Var.climate -> city.setClimate(Climate.valueOf(varsShaper.setClimate()))
            Var.population -> city.setPopulation(varsShaper.setPopulation())
            Var.government -> city.setGovernment(Government.valueOf(varsShaper.setGovernment()))
            Var.agl -> city.setAgglomeration(varsShaper.setAgl())
            Var.age -> city.setArea(varsShaper.setAreaAndAge(Var.age))
            Var.area -> city.setArea(varsShaper.setAreaAndAge(Var.area))
            else -> {
                uPrinter.print{" Ошибка. Указано несуществующее поле, проверьте указанные значения."}
                operator.runCommand(sc.nextLine())
            }
        }
    }
}