package proga_lab_5.commands


import proga_lab_5.commandManager
import proga_lab_5.commands.tools.ArgsInfo
import proga_lab_5.commands.tools.Result
import proga_lab_5.printers.UPrinter


class Help : Command{
    private val argsInfo = ArgsInfo()
    private val printer = UPrinter()

    override fun comply(variables: HashMap<String, Any>): Result {
        val commandDescriptionList: HashMap<String, String> = commandManager.getCommandDescriptionList()
        for (command in commandDescriptionList) {
            printer.printValues(command.key, command.value)
        }
        return Result("Команда успешно выполнена", false)
    }

    override fun getDescription(): String {
        return "Справка по командам. Передаваемых аргументов НЕТ."
    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(0,0,1)
    }

    override fun getName(): String {
        return "help"
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        return HashMap()
    }
}