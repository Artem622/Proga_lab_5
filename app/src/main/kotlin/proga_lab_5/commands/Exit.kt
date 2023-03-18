package proga_lab_5.commands

import proga_lab_5.ArgumentsType
import kotlin.system.exitProcess

class Exit : Command {
    override fun comply(variables: HashMap<String, Any?>): Any? {
        print("Приложение завершает работу...")
        exitProcess(0)
    }

    override fun getName(): String {
        return "exit"
    }
    override fun getDescription(): String {
        return "Выход из приложения"
    }

    override fun argContract(arguments : List<String>): HashMap<String, Any> {
        return HashMap()
    }
    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.NO_ARGS
    }
}