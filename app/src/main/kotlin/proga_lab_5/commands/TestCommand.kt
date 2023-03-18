package proga_lab_5.commands

import proga_lab_5.ArgumentsType

class TestCommand : Command {


    override fun comply(variables: HashMap<String, Any?>): Any {
        return  "command is ran"
    }
    override fun getDescription(): String {
        return "Тестовая команда"
    }
    override fun getName(): String {
        return "test"
    }

    override fun argContract(arguments : List<String>): HashMap<String, Any> {
        return HashMap()
    }

    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.NO_ARGS
    }

}


















