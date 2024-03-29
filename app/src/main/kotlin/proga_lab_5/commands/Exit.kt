package proga_lab_5.commands


import proga_lab_5.commands.tools.ArgsInfo
import proga_lab_5.commands.tools.Result
import proga_lab_5.printers.UPrinter
import kotlin.system.exitProcess

object Message {
    const val MESSAGE = "Приложение завершает свою работу..."
}

/**
 * Exit
 *
 * @constructor Create empty Exit
 */
class Exit : Command {
    private val printer = UPrinter()
    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): Result {
        printer.print { Message.MESSAGE }
        exitProcess(0)
    }

    override fun getName(): String {
        return "exit"
    }
    override fun getDescription(): String {
        return "Выход из приложения. Коллекция автоматически не сохраняется. Передаваемых аргументов НЕТ."
    }

    override fun argContract(arguments : List<String>): HashMap<String, Any> {
        return HashMap()
    }
    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(0,0,1)
    }
}