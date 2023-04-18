package proga_lab_5.tests

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import proga_lab_5.city.Government
import proga_lab_5.commands.Str
import proga_lab_5.commands.Var
import proga_lab_5.commands.tools.ParseToSave
import proga_lab_5.commands.tools.Parser
import proga_lab_5.commands.tools.VarsShaper
import java.io.IOException
import java.time.ZonedDateTime
import kotlin.test.assertEquals as assertEquals

class Dupm {
    private fun parser(path: String){
        val parser = Parser()
        parser.parse(path)
    }
    private fun human(birthday: String){
        val varShaper = VarsShaper()
        varShaper.checkBirthday(birthday)
    }
    private fun government(government: String){
        val varShaper = VarsShaper()
        varShaper.checkGovernment(government)
    }
    private fun invSave(path:String,content:String){
        val saver = ParseToSave()
        saver.writeContent(path,content)
    }
    private fun invPlus(file : String, value : String, tag : String, clTag : String){
        val saver = ParseToSave()
        saver.plus(file, value , tag, clTag)
    }

    @Test
    fun invalidPath() {
        val exception: NoSuchElementException = assertThrows(NoSuchElementException::class.java.name) { parser("/../Data.xml") }
        assertEquals(NoSuchElementException::class, exception::class)
    }
    @Test
    fun invalidData(){
        val exception: Exception = assertThrows(Exception::class.java.name){human("99/99/9999")}
        assertEquals(Exception::class, exception::class)
    }

    @Test
    fun invalidGovernment() {
        val exception: java.lang.IllegalArgumentException = assertThrows(java.lang.IllegalArgumentException::class.java.name) { government("123") }
        assertEquals(java.lang.IllegalArgumentException::class, exception::class)
    }
    @Test
    fun invalidSave() {
        val exception: java.nio.file.FileSystemException = assertThrows(java.nio.file.FileSystemException::class.java.name) { invSave("/../Data.xml","sdsdsd") }
        assertEquals(java.nio.file.FileSystemException::class, exception::class)
    }
    @Test
    fun invalidPlus() {
        val exception: IOException = assertThrows(IOException::class.java.name) { invPlus("123","sdsdsd","dsdsd","sdsdsd") }
        assertEquals(IOException::class, exception::class)
    }
}