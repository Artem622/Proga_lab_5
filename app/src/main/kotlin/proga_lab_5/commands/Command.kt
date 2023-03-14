package proga_lab_5.commands

interface Command {
    fun comply()

    fun getDescription(): String
    fun getName(): String
    fun setArgument(arg : String)

}