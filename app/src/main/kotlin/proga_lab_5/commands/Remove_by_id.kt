package proga_lab_5.commands

import proga_lab_5.ArgumentsType

class Remove_by_id : Command {
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        val numbersOfId = variables["numbers of id"].toString()
        for (i in 1..numbersOfId.toInt()){
            println(variables[i.toString()])
        }
        return HashMap()
    }

    override fun getName(): String {
        return "remove_by_id"
    }

    override fun getDescription(): String {
        return "Удаляет элемент коллекции по его id."
    }

    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.MORE_ARGUMENTS
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val more = MoreArgumentsInCommand()
        return more.moreArguments(arguments, "numbers of id")
    }
}