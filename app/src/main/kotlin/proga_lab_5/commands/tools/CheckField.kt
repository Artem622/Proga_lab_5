package proga_lab_5.commands.tools

import proga_lab_5.city.City
import proga_lab_5.commands.Var
import proga_lab_5.sc
import proga_lab_5.uPrinter

object Action{
    const val remove = "remove"
    const val stay = "stay"
}

/**
 * Check field
 *
 * @constructor Create empty Check field
 */
class CheckField {
    private fun setField(field : String) : String{
        return when (field) {
            Var.name -> Var.name
            Var.id -> Var.id
            Var.meters -> Var.meters
            Var.age -> Var.age
            Var.agl -> Var.agl
            Var.population -> Var.population
            Var.area -> Var.area
            Var.coordinateX -> Var.coordinateX
            Var.coordinateY -> Var.coordinateY
            else -> {
                uPrinter.print { "Введено некорректное поле. Возможно, данное поле не поддерживает подобное удаление. Введите повторно ТОЛЬКО название поля." }
                return "error"
            }
        }
    }

    /**
     * Check field
     *
     * @param field
     * @return
     */
    fun checkField(field : String) : String {
        return if (setField(field) == "error") {
            val newField = sc.nextLine()
            this.setField(newField)
        } else {
            return setField(field)
        }
    }

    /**
     * Remove lower
     *
     * @param city
     * @param field
     * @param arg
     * @return
     */
    fun removeLower(city : City, field : String, arg : String) : String{
        when (field) {
            Var.id -> {
                return if (arg.toInt() > city.getId()!!){
                    Action.remove
                }else{
                    Action.stay
                }
            }
            Var.meters -> {
                return if (arg.toLong() > city.getMetersAboveSeaLevel()!!){
                    Action.remove
                }else{
                    Action.stay
                }
            }
            Var.age -> {
                return if (arg.toInt() > city.getGovernorAge()!!){
                    Action.remove
                }else{
                    Action.stay
                }
            }
            Var.agl -> {
                return if (arg.toDouble() > city.getAgglomeration()!!){
                    Action.remove
                }else{
                    Action.stay
                }
            }
            Var.population ->{
                return if (arg.toLong() > city.getPopulation()!!){
                    Action.remove
                }else{
                    Action.stay
                }
            }
            Var.area -> {
                return if (arg.toInt() > city.getArea()!!){
                    Action.remove
                }else{
                    Action.stay
                }
            }
            Var.name ->{
                return if (arg > city.getName()!!){
                    Action.remove
                }else{
                    Action.stay
                }
            }
            Var.coordinateX -> {
                return if (arg.toInt() > city.getCoordinatesX()){
                    Action.remove
                }else{
                    Action.stay
                }
            }
            else -> {
                return if (arg.toFloat() > city.getCoordinatesY()){
                    Action.remove
                }else{
                    Action.stay
                }
            }
        }
    }
}