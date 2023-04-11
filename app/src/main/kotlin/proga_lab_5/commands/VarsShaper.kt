package proga_lab_5.commands



import proga_lab_5.city.Climate
import proga_lab_5.city.Government
import proga_lab_5.sc
import proga_lab_5.uPrinter
import java.time.LocalDate
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter


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
class VarsShaper {

    fun shape():HashMap<String, Any>{
        val variables = HashMap<String, Any>()
        variables[Var.name] = setName()
        variables[Var.coordinateX] = setCoordX()
        variables[Var.coordinateY] = setCoordY()
        variables[Var.area] = setArea()
        variables[Var.population] = setPopulation()
        variables[Var.meters] = setMeters()
        variables[Var.agl] = setAgl()
        variables[Var.climate] = setClimate()
        variables[Var.government] = setGovernment()
        variables[Var.age] = setAge()
        variables[Var.birthday] = setBirthday()


        return variables
    }
    private fun setName():String{
        uPrinter.print { Messages.setName }
        val name = sc.nextLine()
        return if (name.equals("") || name.equals(null) || name.equals("null")) {
            uPrinter.print { Messages.errorName }
            this.setName()
        } else {
            return name
        }
    }

     private fun setCoordY(): Float {
        uPrinter.print { Messages.setCoordY }
        val y = sc.nextLine()
         return if (checkCoordY(y)) {
             return y.toFloat()
         } else {
             this.setCoordY()
         }
    }

    private fun checkCoordY(y : String) : Boolean{
        return try {
            y.toFloat()
            true
        } catch (e: Exception){
            uPrinter.print { Messages.errorCoords }
            false
        }
    }

    private fun setCoordX():Long {
        uPrinter.print { Messages.setCoordX }
        val x = sc.nextLine()
        return if (checkCoordX(x)) {
            return x.toLong()
        } else {
            this.setCoordX()
        }
    }

    private fun checkCoordX(x : String): Boolean{
        return try {
            x.toLong()
            true
        } catch (e: Exception) {
            uPrinter.print { Messages.errorCoords }
            false
        }
    }
    private fun setArea(): Int{
        uPrinter.print { Messages.setArea }
        val area = sc.nextLine()
        return if (checkArea(area)) {
            area.toInt()
        } else {
            this.setArea()
        }
    }
    private fun checkArea(area : String): Boolean{
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

    private fun setPopulation():Long{
        uPrinter.print { Messages.setPopulation }
        val population = sc.nextLine()
        return if (checkPopulation(population)) {
            return population.toLong()
        } else {
            this.setPopulation()
        }
    }

    private fun checkPopulation(population : String) : Boolean{
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

    private fun setMeters() : Long{
        uPrinter.print { Messages.setMeters }
        val meters = sc.nextLine()
        return if (checkMeters(meters)) {
            return meters.toLong()
        } else {
            this.setMeters()
        }

    }

    private fun checkMeters(meters: String) : Boolean{
        return try {
            meters.toLong()
            true
        } catch (e: Exception) {
            uPrinter.print { Messages.errorValue }
            false
        }
    }
    private fun setAgl() : Double{
        uPrinter.print { Messages.setAgl }
        val agl = sc.nextLine()
        return if (checkAdl(agl)) {
            return agl.toDouble()
        } else {
            this.setAgl()
        }
    }

    private fun checkAdl(agl : String) : Boolean{
        return try {
            agl.toDouble()
            true
        } catch (e: Exception) {
            uPrinter.print { Messages.errorValue }
            false
        }
    }
    private fun setClimate(): String{
        uPrinter.print { Messages.setClimate }
        val climate  = sc.nextLine()
        return if (checkClimate(climate)) {
            return climate.uppercase()
        } else {
            this.setClimate()
        }
    }

    private fun checkClimate(climate : String) : Boolean{
        return try {
            Climate.valueOf(climate.uppercase())
            true
        } catch (e: Exception) {
            uPrinter.print { Messages.errorValue }
            false
        }
    }
    private fun setGovernment(): String{
        uPrinter.print { Messages.setGovernment }
        val government = sc.nextLine()
        return if (checkGovernment(government)) {
            return government.uppercase()
        } else {
            setGovernment()
        }

    }

    private fun checkGovernment(government : String) : Boolean{
        return try {
            Government.valueOf(government.uppercase())
            true
        } catch (e: Exception) {
            uPrinter.print { Messages.errorValue }
            false
        }
    }
    private fun setAge() : Int {
        uPrinter.print { Messages.setAge }
        val age = sc.nextLine()
        return if (checkAge(age)) {
            return age.toInt()
        } else {
            this.setAge()
        }
    }
    private fun checkAge(age : String) : Boolean{
        return try {
            age.toInt()
            if (age.toInt() < 0) {
                uPrinter.print { Messages.errorValue }
                false
            } else {
                true
            }
        } catch (e: Exception) {
            uPrinter.print { Messages.errorValue }
            false
        }
    }
    private fun setBirthday(): String{
        uPrinter.print { Messages.setBirthday }
        val birthday = sc.nextLine()
        return if (checkBirthday(birthday)) {
            return birthday
        } else {
            this.setBirthday()
        }
    }
    private fun checkBirthday(birthday : String) : Boolean{
        return try {
            val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            val date: LocalDate = LocalDate.parse(birthday, formatter)
            val result: ZonedDateTime = date.atStartOfDay(ZoneId.systemDefault())
            true
        } catch (e: Exception) {
            uPrinter.print { Messages.errorValue }
            false
        }
    }
}


