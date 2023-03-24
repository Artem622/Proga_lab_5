package proga_lab_5.commands

import proga_lab_5.ArgumentsType

class PrintAscending : Command {
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        return HashMap()
    }

    override fun getName(): String {
        return "print_ascending"
    }

    override fun getDescription(): String {
        return "Вывод элементов коллекции в естественном порядке."
    }

    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.NO_ARGS
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        return HashMap()
    }
}