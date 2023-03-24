package proga_lab_5.commands

import proga_lab_5.ArgumentsType

class Add : Command {
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        val result : HashMap<String, Any> = HashMap()
        result["message"] = "Команда успешно выполнена."
        return result
    }

    override fun getName(): String {
        return "add"
    }

    override fun getDescription(): String {
        return "Добавление нового элемента в коллекцию."
    }

    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.MORE_ARGUMENTS
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        return HashMap()
    }
}