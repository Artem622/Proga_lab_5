package proga_lab_5.commands

import proga_lab_5.ArgumentsType

class Update_by_id : Command {
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        return HashMap()
    }

    override fun getName(): String {
        return "update_by_id"
    }

    override fun getDescription(): String {
        return "Удаляет элемент из коллекции по его id."
    }

    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.MORE_ARGUMENTS
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

