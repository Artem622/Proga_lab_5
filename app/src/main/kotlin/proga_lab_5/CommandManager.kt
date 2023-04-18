package proga_lab_5

import proga_lab_5.commands.Command
import proga_lab_5.commands.tools.Values
import kotlin.collections.HashMap

object Messages {
    const val MESSAGE = "Некорректное количество передаваемых аргументов. Точнее можно узнать в команде help."
}

/**
 * Command manager
 *
 * @constructor Create empty Command manager
 */
class CommandManager {
    private var commandList  : HashMap<String, Command> = HashMap()
    private var commandDescriptionList   : HashMap<String, String> = HashMap()

    /**
     * Manage
     *
     * @param name
     * @param arguments
     */
    fun manage(name : String, arguments : List<String>){
        if (checkArgumentsInfo(name, arguments)){
            val variables = commandList[name]!!.argContract(arguments)
            val result = commandList[name]!!.comply(variables)
            if (result.getBool()){
                uPrinter.print { result.getMessage() }
            }
        }
    }


    /**
     * Register
     *
     * @param commands
     */
    fun register(vararg commands: Command) {
        for (command in commands) {
            commandList[command.getName()] = command
            commandDescriptionList[command.getName()] = command.getDescription()
        }
    }

    /**
     * Check command
     *
     * @param name
     * @return
     */
    fun checkCommand(name: String): Boolean {
        return commandList[name] != null
    }


    /**
     * Get command description list
     *
     * @return
     */
    fun getCommandDescriptionList(): HashMap<String, String> {
        return commandDescriptionList
    }
    private fun checkArgumentsInfo(name: String, arguments : List<String>): Boolean {
        val info = commandList[name]!!.argsInfo()
        val size = arguments.size
        if (size > info[Values.max]!! || size < info[Values.min]!!){
            uPrinter.print { Messages.MESSAGE }
            return false
        }else if (size < info[Values.max]!! && size > info[Values.min]!! && info[Values.between] == 0) {
            uPrinter.print { Messages.MESSAGE }
            return false
        }else if ((info[Values.max] == info[Values.min]) && info[Values.max] != size){
            uPrinter.print { Messages.MESSAGE }
            return false
        }
        return true
    }
}