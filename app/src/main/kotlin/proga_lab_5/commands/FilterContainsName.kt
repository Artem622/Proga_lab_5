package proga_lab_5.commands

import proga_lab_5.ArgumentsType

class FilterContainsName : Command {
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        return HashMap()
    }

    override fun getName(): String {
        return "filter_contains_name"
    }

    override fun getDescription(): String {
        return "Вывод элементов коллекции, поле name которых содержит заданную подстроку."
    }

    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.ONE_ARGUMENT
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val name : HashMap<String, Any> = HashMap()
        name["Substring"] = arguments[0]
        return name
    }
}