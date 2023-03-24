package proga_lab_5.commands


class Sort : Command {
    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        return HashMap()
    }

    override fun getName(): String {
        return "sort"
    }

    override fun getDescription(): String {
        return "Сортировка элементов в естественном порядке. Передаваемых аргументов НЕТ."
    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(0,0,1)
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        return HashMap()
    }
}