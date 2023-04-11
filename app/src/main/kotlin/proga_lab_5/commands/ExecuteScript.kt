package proga_lab_5.commands

class ExecuteScript: Command{

    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): Result {



        return Result("Команда выполнена", false)
    }

    override fun getName(): String {
        return "execute_script"
    }

    override fun getDescription(): String {
        return "Исполнение команд из указанного файла. Можно передать только ОДИН аргумент."
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val file : HashMap<String, Any> = HashMap()
        file["Way to File"] = arguments[0]
        return file
    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(1, 1, 1)
    }
}