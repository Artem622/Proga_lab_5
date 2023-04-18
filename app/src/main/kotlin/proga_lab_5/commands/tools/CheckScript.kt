package proga_lab_5.commands.tools

import proga_lab_5.operator
import proga_lab_5.sc
import proga_lab_5.uPrinter

/**
 * Check script
 *
 * @constructor Create empty Check script
 */
class CheckScript {
    private val scriptArray = arrayOf("")

    /**
     * Check
     *
     * @param line
     */
    fun check(line : String){
        for (script in scriptArray){
            if (line == script){
                uPrinter.print { "Ошибка. Обнаружена рекурсия." }
                operator.runCommand(sc.nextLine())
            }else{
                scriptArray[scriptArray.size-1] = line
            }
        }
    }
}