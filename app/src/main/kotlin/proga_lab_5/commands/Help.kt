package proga_lab_5.commands


import proga_lab_5.commandManager
import proga_lab_5.printers.UPrinter


class Help : Command{
    private val argsInfo = ArgsInfo()
    private val printer = UPrinter()

    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        val commandDescriptionList: HashMap<String, String> = commandManager.getCommandDescriptionList()
        for (command in commandDescriptionList) {
            printer.printValues(command.key, command.value)
        }
        val result : HashMap<String, Any> = HashMap()
        result["print message"] = false
        result["message"] = "Команда выполнена успешно."
        return result
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