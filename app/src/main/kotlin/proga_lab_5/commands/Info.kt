package proga_lab_5.commands

import proga_lab_5.ArgumentsType

class Info : Command {
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        return HashMap()
    }

    override fun getName(): String {
        return "info"
    }

    override fun getDescription(): String {
        return "Вывод информации о коллекции."
    }

    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.NO_ARGS
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        return HashMap()
    }

}