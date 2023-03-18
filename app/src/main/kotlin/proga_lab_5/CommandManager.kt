package proga_lab_5

import proga_lab_5.commands.Command
import kotlin.collections.HashMap

class CommandManager {
    var commandList  : HashMap<String, Command> = HashMap<String, Command> ()
    var commandDescriptionList   : HashMap<String, String> = HashMap<String, String> ()
    val emptyMap : HashMap<String, Any?> = HashMap()

    fun manage(name : String, arguments : List<String>){

        if (commandList[name]!!.argsInfo() == ArgumentsType.NO_ARGS){
            commandList[name]!!.comply(emptyMap)
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
}