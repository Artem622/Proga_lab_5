package proga_lab_5.commands

import proga_lab_5.ArgumentsType

class Remove_at_index : Command {
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        return HashMap()
    }

    override fun getName(): String {
        return "remove_at"
    }

    override fun getDescription(): String {
        return "Удаляет элемент, находящийся в заданной позиции коллекции (index)."
    }

    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.MORE_ARGUMENTS
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val more = MoreArgumentsInCommand()
        return more.moreArguments(arguments, "numbers of index")
    }
}