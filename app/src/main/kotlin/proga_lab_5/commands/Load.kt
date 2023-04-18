package proga_lab_5.commands

import proga_lab_5.commands.tools.ArgsInfo
import proga_lab_5.commands.tools.Parser
import proga_lab_5.commands.tools.Result

/**
 * Load
 *
 * @constructor Create empty Load
 */
class Load : Command {
    val argsInfo = ArgsInfo()
    private val parser = Parser()

    override fun comply(variables: HashMap<String, Any>): Result {

        parser.parse(variables[Var.wayToFile].toString())
        return Result("Загружено", true)
    }

    override fun getName(): String {
        return "load"
    }

    override fun getDescription(): String {
        return "Загружает информацию из файла в коллекцию."
    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(1,1,0)
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val map = HashMap<String, Any>()
        map[Var.wayToFile] = arguments[0]
        return map
    }
}