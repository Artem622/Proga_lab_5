package proga_lab_5.commands



class RemoveAllByMetersAboveSeaLevel: Command {
    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        val result : HashMap<String, Any> = HashMap()
        result["print message"] = true
        result["message"] = "Команда выполнена успешно."
        return result
    }

    override fun getName(): String {
        return "remove_all_by_meters_above_sea_level"
    }

    override fun getDescription(): String {
        return "Удаляет из коллекции все элементы, значение поля metersAboveSeaLevel которого эквивалентно заданному. Один передаваемых аргумент."
    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(1,1,1)
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val arg : HashMap<String, Any> = HashMap()
        arg["meters"] = arguments[0].toLong()
        return arg
    }
}