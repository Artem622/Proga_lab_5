package proga_lab_5.commands



class Info : Command {
    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        val result : HashMap<String, Any> = HashMap()
        result["print message"] = false
        result["message"] = "Команда выполнена успешно."
        return result
    }

    override fun getName(): String {
        return "info"
    }

    override fun getDescription(): String {
        return "Вывод информации о коллекции. Передаваемых аргументов НЕТ."
    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(0,0,1)
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        return HashMap()
    }

}