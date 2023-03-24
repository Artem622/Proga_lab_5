package proga_lab_5.commands


class RemoveLower : Command {
    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        return HashMap()
    }

    override fun getName(): String {
        return "remove_lower"
    }

    override fun getDescription(): String {
        return "Удаляет из коллекции все элементы, меньшие, чем заданный. Передается ДВА аргумента: (поле) и (значение)."
    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(2,2,1)
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val arg : HashMap<String, Any> = HashMap()
        arg["field"] = arguments[0]
        //Нужно прописать парсеры для каждого поля в его тип данных, а потом прокидывать туда "arg". После чего добавлять в HashMap.
        arg["arg"] = arguments[1]
        return arg
    }
}