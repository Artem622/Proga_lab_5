package proga_lab_5

import java.util.*

class Operator {

    var sc = Scanner(System.`in`)

    fun process(){
        println("Введите абсолютный путь до файла:")
        val file = sc.nextLine()
        println(file)

        while (true){
            val command = sc.nextLine()
            runCommand(command)
        }
    }

    private fun runCommand(command: String){
        val commandAndArguments = command.split(" ")
        val name = commandAndArguments[0]
        val arguments = commandAndArguments.drop(1)

        if (commandManager.checkCommand(name)){

            commandManager.manage(name, arguments)

        }else{
            println("Такой команды не существует")
        }
    }



}