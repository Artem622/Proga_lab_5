package proga_lab_5.commands

import proga_lab_5.commands.Result


class RemoveLower : Command {
    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): Result {
        return Result("Города, у которых значение указанного поля меньше - удалены.", true)
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