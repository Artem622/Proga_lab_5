package proga_lab_5.commands

import proga_lab_5.ArgumentsType

class Sort : Command {
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        return HashMap()
    }

    override fun getName(): String {
        return "sort"
    }

    override fun getDescription(): String {
        return "Сортировка элементов в естественном порядке."
    }

    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.NO_ARGS
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        return HashMap()
    }
}