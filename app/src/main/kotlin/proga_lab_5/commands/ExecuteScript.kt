package proga_lab_5.commands

import proga_lab_5.ArgumentsType

class ExecuteScript: Command{
    override fun comply(variables: HashMap<String, Any>): HashMap<String, Any> {
        return HashMap()
    }

    override fun getName(): String {
        return "execute_script"
    }

    override fun getDescription(): String {
        return "Исполнение команд из указанного файла."
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val file : HashMap<String, Any> = HashMap()
        file["Way to File"] = arguments[0]
        return file
    }

    override fun argsInfo(): ArgumentsType {
        return ArgumentsType.ONE_ARGUMENT
    }
}