package proga_lab_5.commands.tools

class Result(private val message: String, private val bool: Boolean) {
    fun getBool(): Boolean {
        return this.bool
    }
    fun getMessage(): String{
        return this.message
    }
}