package proga_lab_5.commands



class UpdateById : Command {
    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        val result : HashMap<String, Any> = HashMap()
        result["print message"] = true
        result["message"] = "Команда выполнена успешно."
        return result
    }

    override fun getName(): String {
        return "update_by_id"
    }

    override fun getDescription(): String {
        return "Удаляет элемент из коллекции по его id. Диапазон принимаемых аргументов: от 1 до 12.\n" +
                "Правила введения аргументов: Первый - id, далее название полей, которые нуждаются в изменении."

    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(12,1,1)
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val firstMap : HashMap<String, Any> = HashMap()

        if (arguments.size == 1){
            firstMap["all fields"] = "True"
        }else{
            firstMap["all fields"] = "False"
        }

        firstMap["id"] = arguments[0].toInt()

        val fields : List<String> = arguments.drop(1)

        val more = MoreArgumentsInCommand()
        val secondMap = more.moreArguments(fields, "numbers of fields")

        println(firstMap + secondMap)

        return (firstMap + secondMap) as HashMap<String, Any>
    }
}

