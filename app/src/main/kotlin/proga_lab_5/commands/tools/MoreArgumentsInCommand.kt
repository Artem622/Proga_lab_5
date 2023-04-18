package proga_lab_5.commands.tools

/**
 * More arguments in command
 *
 * @constructor Create empty More arguments in command
 */
class MoreArgumentsInCommand {
    /**
     * More arguments
     *
     * @param arguments
     * @param value
     * @return
     */
    fun moreArguments(arguments : List<String>, value : String): HashMap<String, Any> {
        val arg : HashMap<String, Any> = HashMap()
        var key = 1
        for (element in arguments){
            arg[key.toString()] = element
            key += 1
        }
        arg[value] = key-1
        return arg
    }
}