package proga_lab_5.commands

import kotlin.system.exitProcess

class Exit : Command {
    override fun comply() {
        print("Приложение завершает работу...")
        exitProcess(0)
    }

    override fun getName(): String {
        return "exit"
    }
    override fun getDescription(): String {
        return "Выход из приложения"
    }

    override fun setArgument(arg: String){}
}