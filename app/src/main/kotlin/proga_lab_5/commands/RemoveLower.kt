package proga_lab_5.commands

import proga_lab_5.collection
import proga_lab_5.commands.tools.*
import proga_lab_5.city.arrayFreeId

object Str {
    const val field = "field"
    const val arg = "arg"
}

/**
 * Remove lower
 *
 * @constructor Create empty Remove lower
 */
class RemoveLower : Command {
    private val argsInfo = ArgsInfo()
    private val checkField = CheckField()
    private val checkArg = CheckArg()
    override fun comply(variables: HashMap<String, Any>): Result {

        val field = variables[Str.field].toString()
        val arg = variables[Str.arg].toString()

        val iterator = collection.getCollection().iterator()
        while (iterator.hasNext()) {
            val iterCity = iterator.next()
            if (checkField.removeLower(iterCity, field, arg) == Action.remove) {
                arrayFreeId = if (arrayFreeId.isNotEmpty()){
                    arrayFreeId.clone() + iterCity.getId()!!
                } else{
                    arrayOf(iterCity.getId()!!)
                }
                iterator.remove()
            }
        }

        return Result("Города, у которых значение указанного поля меньше - удалены.", true)
    }

    override fun getName(): String {
        return "remove_lower"
    }

    override fun getDescription(): String {
        return "Удаляет из коллекции все элементы, меньшие, чем заданный. Передается ДВА аргумента: (поле) и (значение)."
    }

    override fun argsInfo(): HashMap<String, Int> {
        return argsInfo.setLimits(2,2,1)
    }

    override fun argContract(arguments: List<String>): HashMap<String, Any> {
        val arg : HashMap<String, Any> = HashMap()
        arg[Str.field] = checkField.checkField(arguments[0])
        arg[Str.arg] = checkArg.checkArg(arguments[0] ,arguments[1])

        return arg
    }
}