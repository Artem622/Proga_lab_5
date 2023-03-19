package proga_lab_5.commands

import proga_lab_5.ArgumentsType
import proga_lab_5.printers.ExitPrinter
import kotlin.system.exitProcess

class Exit : Command {
    private val printer = ExitPrinter()
    override fun comply(variables: HashMap<String, Any?>): HashMap<String, Any> {
        printer.print()
        exitProcess(0)
    }

    override fun getName(): String {
        return "exit"
    }
    override fun getDescription(): String {
        return "Выход из приложения. Коллекция автоматически не сохраняется."
    }

    override fun argContract(arguments : List<String>): HashMap<String, Any> {
        return HashMap()
    }
    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.NO_ARGS
    }
}