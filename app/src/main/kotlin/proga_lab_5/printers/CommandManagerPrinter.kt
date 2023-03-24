package proga_lab_5.printers

class CommandManagerPrinter : Printer {
    override fun print() {
        println("Такой команды не существует. Узнать о поддерживаемых командах можно через команду help.")
    }
    fun noArgsError(){
        println("У данной команды не должно быть передаваемых аргументов.")
    }
    fun oneArgError(){
        println("У данной команды должен передаваться один аргумент.")
    }
    fun moreArgsError(){
        println("У данной команды должен быть минимум один аргумент.")
    }
}