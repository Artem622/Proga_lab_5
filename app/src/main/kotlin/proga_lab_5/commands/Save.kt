package proga_lab_5.commands

import proga_lab_5.commands.tools.ArgsInfo
import proga_lab_5.commands.tools.ParseToSave
import proga_lab_5.commands.tools.Result


/**
 * Save
 *
 * @constructor Create empty Save
 */
class Save : Command {
    private val argsInfo = ArgsInfo()
    private val parseToSave = ParseToSave()
    override fun comply(variables: HashMap<String, Any>): Result {
        parseToSave.save()
        return Result("Коллекция сохранена в файл", true)
    }

    override fun getDescription(): String {
        return "Сохранение коллекции в файл. Передаваемых аргументов НЕТ."
    }

    override fun getName(): String {
        return "save"
    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(0,0,1)
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        return HashMap()
    }
}