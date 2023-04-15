package proga_lab_5.commands

import proga_lab_5.collection
import proga_lab_5.commands.tools.ArgsInfo
import proga_lab_5.commands.tools.Result

object Keys {
    const val print = "print message"
    const val message = "message"
}
class Clear : Command {

    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): Result {

        val cityCollection = collection.getCollection()
        cityCollection.clear()

        return Result("Коллекция очищена", true)
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