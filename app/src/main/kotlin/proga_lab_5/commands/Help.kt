package proga_lab_5.commands


import proga_lab_5.commandManager
import proga_lab_5.printers.HelpPrinter


class Help : Command{
    private val argsInfo = ArgsInfo()
    private val printer = HelpPrinter()

    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        val commandDescriptionList: HashMap<String, String> = commandManager.getCommandDescriptionList()
        for (command in commandDescriptionList) {
            printer.printArgs(command.key, command.value)
        }
        return HashMap()
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