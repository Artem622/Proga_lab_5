package proga_lab_5.printers

class CommandManagerPrinter : Printer {
    override fun print() {
        println("Такой команды не существует. Узнать о поддерживаемых командах можно через команду help.")
    }
    fun noArgs(){
        println("У данной команды не должно быть передаваемых аргументов.")
    }
}