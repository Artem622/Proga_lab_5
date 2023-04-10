package proga_lab_5.commands


class Clear : Command {

    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        val result : HashMap<String, Any> = HashMap()
        result["print message"] = true
        result["message"] = "Коллекция очищена."
        return result
    }

    override fun getName(): String {
        return "clear"
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        return HashMap()
    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(0,0,1)
    }

    override fun getDescription(): String {
        return "Очищение коллекции. Передаваемых аргументов НЕТ."
    }
}