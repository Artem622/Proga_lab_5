package proga_lab_5.printers

class HelpPrinter : Printer {
    override fun print(){}
    fun printArgs(key : String, value: String){
        println("$key : $value")
    }
}