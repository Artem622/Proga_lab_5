package proga_lab_5.commands


class RemoveAt : Command {
    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        val result : HashMap<String, Any> = HashMap()
        result["print message"] = true
        result["message"] = "Команда выполнена успешно."
        return result
    }

    override fun getName(): String {
        return "remove_at"
    }

    override fun getDescription(): String {
        return "Удаляет элемент, находящийся в заданной позиции коллекции (index). Количество аргументов не должно превышать количества элементов в коллекции."
    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(150,1,1)
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val more = MoreArgumentsInCommand()
        return more.moreArguments(arguments, "numbers of index")
    }
}