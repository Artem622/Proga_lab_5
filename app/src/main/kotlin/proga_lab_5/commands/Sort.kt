package proga_lab_5.commands

import proga_lab_5.city.CityComparator
import proga_lab_5.collection
import proga_lab_5.commands.tools.ArgsInfo
import proga_lab_5.commands.tools.Result


/**
 * Sort
 *
 * @constructor Create empty Sort
 */
class Sort : Command {
    private val argsInfo = ArgsInfo()
    override fun comply(variables: HashMap<String, Any>): Result {

        val c = CityComparator()
        val cl = collection.getCollection()

        cl.sortWith(c)

        return Result("Коллекция отсортирована", true)
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