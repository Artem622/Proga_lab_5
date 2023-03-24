package proga_lab_5

import proga_lab_5.printers.OperatorPrinter
import java.util.*

class Operator {
    private val operatorPrinter = OperatorPrinter()

    var sc = Scanner(System.`in`)

    fun process(){

        operatorPrinter.print()

        val file = sc.nextLine()

        //Написать код для загрузки данных из файла в коллекцию

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
            if (arguments.isNotEmpty() && arguments.last() == ""){
                val argumentsWithoutLast = arguments.dropLast(1)
                commandManager.manage(name, argumentsWithoutLast)
            }else{
            commandManager.manage(name, arguments)}

        }else{
            commandManager.noCommandPrinter()
        }
    }


}