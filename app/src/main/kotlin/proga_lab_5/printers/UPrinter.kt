package proga_lab_5.printers

class UPrinter : Printer{
    fun printValues(key: String, value : String) {
        print {
            "$key --- $value"
        }
    }
}