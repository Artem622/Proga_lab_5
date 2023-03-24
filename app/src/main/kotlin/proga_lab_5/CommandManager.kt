package proga_lab_5

import proga_lab_5.commands.Command
import proga_lab_5.printers.CommandManagerPrinter
import kotlin.collections.HashMap

class CommandManager {
    private val commandManagerPrinter = CommandManagerPrinter()
    var commandList  : HashMap<String, Command> = HashMap()
    private var commandDescriptionList   : HashMap<String, String> = HashMap()

    fun manage(name : String, arguments : List<String>){
        if (checkArgumentsInfo(name, arguments)){
            val variables = commandList[name]!!.argContract(arguments)
            commandList[name]!!.comply(variables)
        }
    }


    fun register(vararg commands: Command) {
        for (command in commands) {
            commandList[command.getName()] = command
            commandDescriptionList[command.getName()] = command.getDescription()
        }
    }
    fun checkCommand(name: String): Boolean {
        return commandList[name] != null
    }


    fun getCommandDescriptionList(): HashMap<String, String> {
        return commandDescriptionList
    }

    fun noCommandPrinter(){
        return commandManagerPrinter.print()
    }
    private fun checkArgumentsInfo(name: String, arguments : List<String>): Boolean {
        val info = commandList[name]!!.argsInfo()
        val size = arguments.size
        if (size > info["max"]!! || size < info["min"]!!){
            commandManagerPrinter.incorrectQuantity()
            return false
        }else if (size < info["max"]!! && size > info["min"]!! && info["between"] == 0) {
            commandManagerPrinter.incorrectQuantity()
            return false
        }else if ((info["max"] == info["min"]) && info["max"] != size){
            commandManagerPrinter.incorrectQuantity()
            return false
        }
        return true
    }
}