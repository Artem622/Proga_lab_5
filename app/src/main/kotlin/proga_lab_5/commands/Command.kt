package proga_lab_5.commands

import proga_lab_5.ArgumentsType

interface Command {
    fun comply(variables : HashMap<String, Any?>): HashMap<String, Any>
    fun getDescription(): String
    fun getName(): String
    fun argContract(arguments : List<String>): HashMap<String, Any>
    fun argsInfo(): ArgumentsType
}