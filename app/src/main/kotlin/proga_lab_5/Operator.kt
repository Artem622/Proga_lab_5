package proga_lab_5

import proga_lab_5.commands.Command
import java.util.*

class Operator {

    var commandList  : HashMap<String, Command> = HashMap<String, Command> ()
    var commandDescriptionList   : HashMap<String, String> = HashMap<String, String> ()

    private var scanner = Scanner(System.`in`)

    fun start(){
        println("Введите абсолютный путь до файла:")
        val file = scanner.nextLine()


        val command = scanner.nextLine()

        next(command)
    }

    fun next(command : String){
        //Исполнение переданной команды
        runCommand(command)

        //Считывание новой команды
        next(scanner.nextLine())
    }
    private fun runCommand(command: String){
        val commandAndArguments = command.split(" ")
        val name = commandAndArguments[0]
        val arguments = commandAndArguments.drop(1)


        if (commandList[name] == null){
            println("Такой команды не существует")
        }
        else if (commandAndArguments.size == 1){
            commandList[name]!!.comply()
        }
        else{
            for (arg in arguments){
                try {
                    commandList[name]!!.setArgument(arg)
                    commandList[name]!!.comply()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    }

    fun register(vararg commands: Command) {
        for (command in commands) {
            commandList[command.getName()] = command
            commandDescriptionList[command.getName()] = command.getDescription()  //Kotlin предлагает так добавлять.
        }
    }

}