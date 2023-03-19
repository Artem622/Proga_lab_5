package proga_lab_5

import proga_lab_5.commands.Command
import proga_lab_5.printers.CommandManagerPrinter
import kotlin.collections.HashMap

class CommandManager {
    private val commandManagerPrinter = CommandManagerPrinter()
    var commandList  : HashMap<String, Command> = HashMap<String, Command> ()
    private var commandDescriptionList   : HashMap<String, String> = HashMap<String, String> ()
    private val emptyMap : HashMap<String, Any?> = HashMap()

    fun manage(name : String, arguments : List<String>){

        if (commandList[name]!!.argsInfo() == ArgumentsType.NO_ARGS){
            if (arguments.isNotEmpty()){
                commandManagerPrinter.noArgs()}
            else{
            commandList[name]!!.comply(emptyMap)}
        }
        else {
            val variables : HashMap<String, Any?> = HashMap(commandList[name]!!.argContract(arguments))
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
}