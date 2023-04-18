package proga_lab_5.commands.tools



import proga_lab_5.city.Climate
import proga_lab_5.city.Government
import proga_lab_5.commands.Var
import proga_lab_5.sc
import proga_lab_5.uPrinter
import java.io.IOException
import java.time.LocalDate
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException


object Messages{
    const val setName = "Укажите название города:"
    const val errorName = "Название города не может быть пустой строкой или null."

    const val setCoordX = "Введите координату X (Long):"
    const val setCoordY = "Введите координату Y (Float):"
    const val errorCoords = "Указано некорректное значение координаты."

    const val setArea = "Введите значение поля Area (Int, не отрицательная):"
    const val errorValue = "Указано некорректное значение переменной."
    const val setPopulation = "Введите количество жителей (Long, не отрицательное):"
    const val setMeters = "Введите высоту над уровнем моря (Long):"
    const val setAgl = "Введите значение поля Agglomeration (Double)"
    const val setClimate = "Укажите климат из перечисленных значений: \n\t HUMIDCONTINENTAL, \n\t MEDITERRANIAN, \n\t STEPPE."
    const val setGovernment = "Укажите тип правительства из перечисленных: \n\t OLIGARCHY, \n\t JUNTA, \n\t ETHNOCRACY."
    const val setAge = "Укажите возраст губернатора (Int):"
    const val setBirthday = "Укажите день рождения губернатора в формате DD/MM/YYYY:"

}

/**
 * Vars shaper
 *
 * @constructor Create empty Vars shaper
 */
class VarsShaper {

    /**
     * Shape
     *
     * @return
     */
    fun shape():HashMap<String, Any>{
        val variables = HashMap<String, Any>()
        variables[Var.name] = setName()
        variables[Var.coordinateX] = setCoordX()
        variables[Var.coordinateY] = setCoordY()
        variables[Var.area] = setAreaAndAge(Var.area)
        variables[Var.population] = setPopulation()
        variables[Var.meters] = setMeters()
        variables[Var.agl] = setAgl()
        variables[Var.climate] = setClimate()
        variables[Var.government] = setGovernment()
        variables[Var.age] = setAreaAndAge(Var.age)
        variables[Var.birthday] = setBirthday()


        return variables
    }

    /**
     * Set name
     *
     * @return
     */
    fun setName():String{
        uPrinter.print { Messages.setName }
        val name = sc.nextLine()
        return if (checkName(name)) {
            return name
        } else {
            this.setName()
        }
    }

    /**
     * Check name
     *
     * @param name
     * @return
     */
    fun checkName(name : String) : Boolean{
        return if (name == "" || name.equals(null) || name == "null") {
            uPrinter.print { Messages.errorName }
            this.setName()
            false
        } else {
            true
        }
    }

    /**
     * Set coord y
     *
     * @return
     */
    fun setCoordY(): Float {
        uPrinter.print { Messages.setCoordY }
        val y = sc.nextLine()
         return if (checkCoordY(y)) {
             return y.toFloat()
         } else {
             this.setCoordY()
         }
    }

    /**
     * Check coord y
     *
     * @param y
     * @return
     */
    fun checkCoordY(y : String) : Boolean{
        return try {
            y.toFloat()
            true
        } catch (e: Exception){
            uPrinter.print { Messages.errorCoords }
            false
        }
    }

    /**
     * Set coord x
     *
     * @return
     */
    fun setCoordX():Long {
        uPrinter.print { Messages.setCoordX }
        val x = sc.nextLine()
        return if (checkCoordX(x)) {
            x.toLong()
        } else {
            this.setCoordX()
        }
    }

    /**
     * Check coord x
     *
     * @param x
     * @return
     */
    fun checkCoordX(x : String): Boolean{
        return try {
            x.toLong()
            true
        } catch (e: Exception) {
            uPrinter.print { Messages.errorCoords }
            false
        }
    }

    /**
     * Set area and age
     *
     * @param filed
     * @return
     */
    fun setAreaAndAge(filed : String): Int{
        if (filed == Var.area){
        uPrinter.print { Messages.setArea }
        } else{
            uPrinter.print { Messages.setAge }
        }
        val area = sc.nextLine()
        return if (checkAreaAndAge(area)) {
            area.toInt()
        } else {
            this.setAreaAndAge(filed)
        }
    }

    /**
     * Check area and age
     *
     * @param area
     * @return
     */
    fun checkAreaAndAge(area : String): Boolean{
        return try {
            area.toInt()
            if (area.toInt() < 0){
                uPrinter.print { Messages.errorValue }
                false}
            else{
                true}
        }catch (e : Exception){
            uPrinter.print { Messages.errorValue }
            false
        }
    }

    /**
     * Set population
     *
     * @return
     */
    fun setPopulation():Long{
        uPrinter.print { Messages.setPopulation }
        val population = sc.nextLine()
        return if (checkPopulation(population)) {
            return population.toLong()
        } else {
            this.setPopulation()
        }
    }

    /**
     * Check population
     *
     * @param population
     * @return
     */
    fun checkPopulation(population : String) : Boolean{
        return try {
            population.toLong()
            if (population.toLong() < 0) {
                uPrinter.print { Messages.errorValue }
                this.setPopulation()
            }
            true
        } catch (e: Exception) {
            uPrinter.print { Messages.errorValue }
            false
        }
    }

    /**
     * Set meters
     *
     * @return
     */
    fun setMeters() : Long{
        uPrinter.print { Messages.setMeters }
        val meters = sc.nextLine()
        return if (checkMeters(meters)) {
            return meters.toLong()
        } else {
            this.setMeters()
        }

    }

    /**
     * Check meters
     *
     * @param meters
     * @return
     */
    fun checkMeters(meters: String) : Boolean{
        return try {
            meters.toLong()
            true
        } catch (e: Exception) {
            uPrinter.print { Messages.errorValue }
            false
        }
    }

    /**
     * Set agl
     *
     * @return
     */
    fun setAgl() : Double{
        uPrinter.print { Messages.setAgl }
        val agl = sc.nextLine()
        return if (checkAdl(agl)) {
            return agl.toDouble()
        } else {
            this.setAgl()
        }
    }

    /**
     * Check adl
     *
     * @param agl
     * @return
     */
    fun checkAdl(agl : String) : Boolean{
        return try {
            agl.toDouble()
            true
        } catch (e: Exception) {
            uPrinter.print { Messages.errorValue }
            false
        }
    }

    /**
     * Set climate
     *
     * @return
     */
    fun setClimate(): String{
        uPrinter.print { Messages.setClimate }
        val climate  = sc.nextLine()
        return if (checkClimate(climate)) {
            return climate.uppercase()
        } else {
            this.setClimate()
        }
    }

    /**
     * Check climate
     *
     * @param climate
     * @return
     */
    fun checkClimate(climate : String) : Boolean{
        return try {
            Climate.valueOf(climate.uppercase())
            true
        } catch (e: Exception) {
            uPrinter.print { Messages.errorValue }
            false
        }
    }

    /**
     * Set government
     *
     * @return
     */
    fun setGovernment(): String{
        uPrinter.print { Messages.setGovernment }
        val government = sc.nextLine()
        return if (checkGovernment(government)) {
            return government.uppercase()
        } else {
            setGovernment()
        }
    }

    /**
     * Check government
     *
     * @param government
     * @return
     */
    fun checkGovernment(government : String) : Boolean{
        return try {
            Government.valueOf(government.uppercase())
            true
        } catch (e: java.lang.IllegalArgumentException) {
            uPrinter.print { Messages.errorValue }
            false
        }
    }

    /**
     * Set birthday
     *
     * @return
     */
    fun setBirthday(): String{
        uPrinter.print { Messages.setBirthday }
        val birthday = sc.nextLine()
        return if (checkBirthday(birthday)) {
            return birthday
        } else {
            this.setBirthday()
        }
    }

    /**
     * Check birthday
     *
     * @param birthday
     * @return
     */
    fun checkBirthday(birthday : String) : Boolean{
        return try {
            val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            val date: LocalDate = LocalDate.parse(birthday, formatter)
            val result: ZonedDateTime = date.atStartOfDay(ZoneId.systemDefault())
            true
        } catch (e: java.time.format.DateTimeParseException) {
            uPrinter.print { Messages.errorValue }
            false


        }
    }
}


