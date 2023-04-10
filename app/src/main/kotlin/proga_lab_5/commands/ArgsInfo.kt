package proga_lab_5.commands


class ArgsInfo {
    fun setLimits(max : Int , min : Int, inBetween : Int) : HashMap<String, Int> {
        val argsInfo : HashMap<String, Int> = HashMap()
        argsInfo["max"] = max       //Максимально допустимое количество принимаемых аргументов.
        argsInfo["min"] = min       //Минимально допустимое количество принимаемых аргументов.
        argsInfo["between"] = inBetween   //Можно ли указать аргументы в количестве меньшим, чем max, но большим, чем min.
        return argsInfo
    }
}