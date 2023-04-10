package proga_lab_5.commands


class RemoveById : Command {
    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        val numbersOfId = variables["numbers of id"].toString()
        for (i in 1..numbersOfId.toInt()){
            println(variables[i.toString()])
        }
        val result : HashMap<String, Any> = HashMap()
        result["print message"] = true
        result["message"] = "Команда выполнена успешно."
        return result
    }

    override fun getName(): String {
        return "remove_by_id"
    }

    override fun getDescription(): String {
        return "Удаляет элемент коллекции по его id. Количество аргументов не должно превышать количества элементов в коллекции.\""
    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(150,1,1)
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val more = MoreArgumentsInCommand()
        return more.moreArguments(arguments, "numbers of id")
    }
}