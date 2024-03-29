package proga_lab_5.commands.tools
object Values {
    const val max = "max"
    const val min = "min"
    const val between = "between"
}

/**
 * Args info
 *
 * @constructor Create empty Args info
 */
class ArgsInfo {
    /**
     * Set limits
     *
     * @param max
     * @param min
     * @param inBetween
     * @return
     */
    fun setLimits(max : Int, min : Int, inBetween : Int) : HashMap<String, Int> {
        val argsInfo : HashMap<String, Int> = HashMap()
        argsInfo[Values.max] = max       //Максимально допустимое количество принимаемых аргументов.
        argsInfo[Values.min] = min       //Минимально допустимое количество принимаемых аргументов.
        argsInfo[Values.between] = inBetween   //Можно ли указать аргументы в количестве меньшим, чем max, но большим, чем min.
        return argsInfo
    }
}