package proga_lab_5.commands

import proga_lab_5.ArgumentsType

class Show : Command {
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        return HashMap()
    }

    override fun getName(): String {
        return "show"
    }

    override fun getDescription(): String {
        return "Вывод элементов коллекции."
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        return HashMap()
    }

    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.NO_ARGS
    }
}