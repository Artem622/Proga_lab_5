package proga_lab_5.commands.tools

import proga_lab_5.commands.Var
import proga_lab_5.sc
import proga_lab_5.uPrinter

/**
 * Check arg
 *
 * @constructor Create empty Check arg
 */
class CheckArg {
    private val varShaper = VarsShaper()
    private fun setArg(field: String, arg: String) : Boolean{
        return when (field) {
            Var.area -> varShaper.checkAreaAndAge(arg)
            Var.age ->  varShaper.checkAreaAndAge(arg)
            Var.coordinateY -> varShaper.checkCoordY(arg)
            Var.coordinateX -> varShaper.checkCoordX(arg)
            Var.agl -> varShaper.checkAdl(arg)
            Var.climate -> varShaper.checkClimate(arg)
            Var.population -> varShaper.checkPopulation(arg)
            Var.government -> varShaper.checkGovernment(arg)
            Var.birthday -> varShaper.checkBirthday(arg)
            Var.meters -> varShaper.checkMeters(arg)
            Var.id ->
                return try{
                    arg.toInt() >= 0
                }catch (e : Exception){
                    false
                }
            else -> varShaper.checkName(arg)
        }
    }

    /**
     * Check arg
     *
     * @param field
     * @param arg
     * @return
     */
    fun checkArg(field: String, arg:String):String{
        return if (!setArg(field, arg)){
            uPrinter.print { "Указанное значение не удовлетворяет условиям поля, введите значение повторно." }
            val newArg = sc.nextLine()
            this.checkArg(field, newArg)
        }else{
            arg
        }
    }
}