package proga_lab_5

import proga_lab_5.commands.Command
import proga_lab_5.printers.CommandManagerPrinter
import kotlin.collections.HashMap

class CommandManager {
    private val commandManagerPrinter = CommandManagerPrinter()
    var commandList  : HashMap<String, Command> = HashMap()
    private var commandDescriptionList   : HashMap<String, String> = HashMap()

    fun manage(name : String, arguments : List<String>){
        if (checkArgumentsType(name, arguments)){
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
    private fun checkArgumentsType(name: String, arguments : List<String>): Boolean {
        return if (commandList[name]!!.argsInfo() == ArgumentsType.NO_ARGS && arguments.isNotEmpty()){
            commandManagerPrinter.noArgsError()
            false
        }else if (commandList[name]!!.argsInfo() == ArgumentsType.ONE_ARGUMENT && arguments.size != 1){
            commandManagerPrinter.oneArgError()
            false
        }else if (commandList[name]!!.argsInfo() == ArgumentsType.MORE_ARGUMENTS && arguments.isEmpty()){
            commandManagerPrinter.moreArgsError()
            false
        }else{
            true
        }
    }
}