package proga_lab_5.commands

import proga_lab_5.ArgumentsType

class Save : Command {
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        return HashMap()
    }

    override fun getDescription(): String {
        return "Сохранение коллекции в файл."
    }

    override fun getName(): String {
        return "save"
    }

    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.NO_ARGS
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        return HashMap()
    }
}