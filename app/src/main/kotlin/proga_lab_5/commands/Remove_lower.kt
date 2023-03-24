package proga_lab_5.commands

import proga_lab_5.ArgumentsType

class Remove_lower : Command {
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        return HashMap()
    }

    override fun getName(): String {
        return "remove_lower"
    }

    override fun getDescription(): String {
        return "Удаляет из коллекции все элементы, меньшие, чем заданный."
    }

    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.MORE_ARGUMENTS
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val arg : HashMap<String, Any> = HashMap()
        arg["field"] = arguments[0]
        //Нужно прописать парсеры для каждого поля в его тип данных, а потом прокидывать туда "arg". После чего добавлять в HashMap.
        arg["arg"] = arguments[1]
        return arg
    }
}