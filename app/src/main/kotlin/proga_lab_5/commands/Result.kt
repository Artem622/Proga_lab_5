package proga_lab_5.commands

class Result {


    private val message : String
    private val bool : Boolean

    constructor(message : String, bool : Boolean){
        this.message = message
        this.bool = bool
    }
    fun getBool(): Boolean {
        return this.bool
    }
    fun getMessage(): String{
        return this.message
    }
}