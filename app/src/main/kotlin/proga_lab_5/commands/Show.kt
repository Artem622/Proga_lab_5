package proga_lab_5.commands


class Show : Command {
    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        return HashMap()
    }

    override fun getName(): String {
        return "show"
    }

    override fun getDescription(): String {
        return "Вывод элементов коллекции. Передаваемых аргументов НЕТ."
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        return HashMap()
    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(0,0,1)
    }
}