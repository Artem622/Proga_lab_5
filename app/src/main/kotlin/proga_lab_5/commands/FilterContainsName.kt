package proga_lab_5.commands



class FilterContainsName : Command {
    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        val result : HashMap<String, Any> = HashMap()
        result["print message"] = false
        result["message"] = "Команда выполнена успешно."
        return result
    }

    override fun getName(): String {
        return "filter_contains_name"
    }

    override fun getDescription(): String {
        return "Вывод элементов коллекции, поле name которых содержит заданную подстроку. Диапазон аргументов: от 1 до 100."
    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(100,1,1)
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val name : HashMap<String, Any> = HashMap()
        name["Substring"] = arguments[0]
        return name
    }
}