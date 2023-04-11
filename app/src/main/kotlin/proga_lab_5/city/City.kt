package proga_lab_5.city

import java.time.LocalDateTime
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

class City {
    private var id: Long? =null
    private var name: String? =null
    private var coordinates: Coordinates? = Coordinates(0,0L)
    private var creationDate: LocalDateTime? = LocalDateTime.now()
    private var area: Int? =null
    private var population: Long? =null
    private var metersAboveSeaLevel: Long? =null
    private var agglomeration: Double? =null
    private var climate: Climate? =null
    private var government: Government? =null
    private var governor: Human? = Human("","")

    override fun toString(): String {
        val formatted = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        val str = StringBuilder()
        str.append("id города").append(id)
        str.append("название города").append(name)
        str.append("координаты города").append(coordinates.toString())
        str.append("дата создания").append(creationDate!!.format(formatted))
        str.append("территория").append(area)
        str.append("население").append(population)
        str.append("высота над уровнем моря").append(metersAboveSeaLevel)
        str.append("агломерация").append(agglomeration)
        str.append("климат").append(climate)
        str.append("правительство").append(government)
        str.append("правитель").append(government.toString()).append("\n")
        return str.toString()
    }

    fun getCoordinates(): Coordinates? = coordinates
    fun setCoordinates(coordinates: Coordinates) {
        this.coordinates = coordinates
    }

    fun getCoordinatesX(): String? {
        return coordinates!!.getX().toString()
    }
    fun setCoordinatesX(x: Long) {
        coordinates!!.setX(x)
    }

    fun getCoordinatesY(): String? {
        return coordinates!!.getY().toString()
    }
    fun setCoordinatesY(y: Long) {
        coordinates!!.setY(y)
    }

    fun getMetersAboveSeaLevel(): Long? = metersAboveSeaLevel
    fun setMetersAboveSeaLevel(metersAboveSeaLevel: Long){
        this.metersAboveSeaLevel = metersAboveSeaLevel
    }

    fun getGovernor(): Human? = governor
    fun setGovernor(governor: Human?){
        this.governor = governor
    }

    fun getGovernorAge(): Int? = governor!!.getAge()
    fun setGovernorAge(age: Int){
        governor!!.setAge(age)
    }

    fun getGovernorBirthday(): ZonedDateTime? = governor!!.getBirthday()
    fun setGovernorAge(birthday: ZonedDateTime){
        governor!!.setBirthday(birthday)
    }

    fun getName(): String? = name
    fun setName(name: String) {
        this.name = name
    }

    fun getId(): Long? = id
    fun setId(id: Long?) {
        this.id = id
    }

    fun getCreationDate(): LocalDateTime? = creationDate
    fun setCreationDate(creationDate: LocalDateTime?) {
        this.creationDate = creationDate
    }

    fun getClimate(): Climate? = climate
    fun setClimate(climate: Climate){
        this.climate = climate
    }

    fun getGovernment(): Government? = government
    fun setGovernment(government: Government){
        this.government = government
    }

    fun getAgglomeration(): Double? = agglomeration
    fun setAgglomeration(agglomeration: Double){
        this.agglomeration = agglomeration
    }

    fun getArea(): Int? = area
    fun setArea(area: Int){
        this.area = area
    }

    fun getPopulation(): Long?= population
    fun setPopulation(population: Long){
        this.population = population
    }


}