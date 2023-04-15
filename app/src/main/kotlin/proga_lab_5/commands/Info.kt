package proga_lab_5.commands

import proga_lab_5.collection
import proga_lab_5.commands.tools.ArgsInfo
import proga_lab_5.commands.tools.Result
import proga_lab_5.uPrinter


class Info : Command {
    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): Result {

        val collectionInfo = collection.getCollection()

        uPrinter.print { "Дата инициализации: " + collection.getCreationTime().toString() +"; Количество элементов: " +  collectionInfo.size}

        return Result("Команда выполнена успешно.", false)
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