package proga_lab_5.commands

import proga_lab_5.ArgumentsType

class Remove_all_by_meters_above_sea_level: Command {
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        return HashMap()
    }

    override fun getName(): String {
        return "remove_all_by_meters_above_sea_level"
    }

    override fun getDescription(): String {
        return "Удаляет из коллекции все элементы, значение поля metersAboveSeaLevel которого эквивалентно заданному."
    }

    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.ONE_ARGUMENT
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val arg : HashMap<String, Any> = HashMap()
        arg["meters"] = arguments[0].toLong()
        return arg
    }
}