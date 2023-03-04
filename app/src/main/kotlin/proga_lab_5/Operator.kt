package proga_lab_5

import java.util.Scanner

class Operator {

    private var scanner = Scanner(System.`in`)

    fun start(){
        println("Введите абсолютный путь до файла:")
        val file = scanner.nextLine()


        val command = scanner.nextLine()

        next(command)
    }

    fun next(command : String){
        //Заменить на код, который ранит команду.


        //Считывание следующей команды.

        next(scanner.nextLine())
    }
}