package proga_lab_5.commands.tools

import proga_lab_5.collection
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

/**
 * Parse to save
 *
 * @constructor Create empty Parse to save
 */
class ParseToSave {
    var file = """<?xml version="1.0"?"""
    private val cl = collection.getCollection()

    /**
     * Save
     *
     */
    fun save(){
        for (i in 0 until cl.size){
            val city = cl[i]
            val name = city.getName()
            val coordX = city.getCoordinatesX()
            val coordY = city.getCoordinatesY()
            val area = city.getArea()
            val population = city.getPopulation()
            val meters = city.getMetersAboveSeaLevel()
            val agl = city.getAgglomeration()
            val climate = city.getClimate()
            val government = city.getGovernment()
            val age = city.getGovernorAge()
            val birthday = city.getGovernorBirthday()
            file += "\n<City>\n\t"
            plus(file, name.toString(), "<name>", "</name>")
            plus(file, coordX.toString(), "<coordinateX>", "</coordinateX>")
            plus(file, coordY.toString(), "<coordinateY>", "</coordinateY>")
            plus(file, area.toString(), "<area>", "</area>")
            plus(file, population.toString(), "<population>", "</population>")
            plus(file, meters.toString(), "<meters>", "</meters>")
            plus(file, agl.toString(), "<agl>", "</agl>")
            plus(file, climate.toString(), "<climate>", "</climate>")
            plus(file, government.toString(), "<government>", "</government>")
            plus(file, age.toString(), "<age>", "</age>")
            plus(file, birthday.toString(), "<birthday>", "</birthday>")
            file += "</City>"
        }
        val wayToFile = "//Users//artemkotenkov//Documents//itmo//prog//save.xml"
        writeContent(wayToFile, file)

    }

    /**
     * Plus
     *
     * @param file
     * @param value
     * @param tag
     * @param clTag
     */
    fun plus(file : String, value : String, tag : String, clTag : String){
        try {
            this.file = file + tag + value + clTag + "\n\t"
        }catch (error: FileSystemException){
            error.printStackTrace()
        }

    }
    fun writeContent(source: String, content: String) {
        try {
            Files.write(Paths.get(source), content.toByteArray(), StandardOpenOption.APPEND, StandardOpenOption.CREATE)
        } catch (error: FileSystemException) {
            error.printStackTrace()
        }
    }
}