package proga_lab_5.printers

interface Printer {
    fun print(supplier: () -> String) {
        println(supplier())
    }
}