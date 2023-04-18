package proga_lab_5.city

import java.time.LocalDateTime
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

/**
 * City
 *
 * @constructor Create empty City
 */
class City {
    private var id: Long? =null
    private var name: String? =null
    private var coordinates: Coordinates? = Coordinates(0,0F)
    private var creationDate: LocalDateTime? = LocalDateTime.now()
    private var area: Int? =null
    private var population: Long? =null
    private var metersAboveSeaLevel: Long? =null
    private var agglomeration: Double? =null
    private var climate: Climate? =null
    private var government: Government? =null
    private var governor: Human? = Human()


    override fun toString(): String {
        val formatted = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        val str = StringBuilder()
        str.append("id города: ").append(id)
        str.append("; Название города: ").append(name)
        str.append("; Координаты города: ").append(coordinates.toString())
        str.append("; Дата создания: ").append(creationDate!!.format(formatted))
        str.append("; Территория: ").append(area)
        str.append("; Население: ").append(population)
        str.append("; Высота над уровнем моря: ").append(metersAboveSeaLevel)
        str.append("; Агломерация: ").append(agglomeration)
        str.append("; Климат: ").append(climate)
        str.append("; Правительство: ").append(government)
        str.append("; Губернатор: ").append(governor.toString()).append("\n")
        return str.toString()
    }

    /**
     * Get coordinates
     *
     * @return
     */
    fun getCoordinates(): Coordinates? = coordinates

    /**
     * Set coordinates
     *
     * @param coordinates
     */
    fun setCoordinates(coordinates: Coordinates) {
        this.coordinates = coordinates
    }

    /**
     * Get coordinates x
     *
     * @return
     */
    fun getCoordinatesX(): Long{
        return coordinates!!.getX()
    }

    /**
     * Set coordinates x
     *
     * @param x
     */
    fun setCoordinatesX(x: Long) {
        coordinates!!.setX(x)
    }

    /**
     * Get coordinates y
     *
     * @return
     */
    fun getCoordinatesY(): Float {
        return coordinates!!.getY()
    }

    /**
     * Set coordinates y
     *
     * @param y
     */
    fun setCoordinatesY(y: Float) {
        coordinates!!.setY(y)
    }

    /**
     * Get meters above sea level
     *
     * @return
     */
    fun getMetersAboveSeaLevel(): Long? = metersAboveSeaLevel

    /**
     * Set meters above sea level
     *
     * @param metersAboveSeaLevel
     */
    fun setMetersAboveSeaLevel(metersAboveSeaLevel: Long){
        this.metersAboveSeaLevel = metersAboveSeaLevel
    }

    /**
     * Get governor
     *
     * @return
     */
    fun getGovernor(): Human? = governor

    /**
     * Set governor
     *
     * @param governor
     */
    fun setGovernor(governor: Human?){
        this.governor = governor
    }

    /**
     * Get governor age
     *
     * @return
     */
    fun getGovernorAge(): Int? = governor!!.getAge()

    /**
     * Set governor age
     *
     * @param age
     */
    fun setGovernorAge(age: Int){
        governor!!.setAge(age)
    }

    /**
     * Get governor birthday
     *
     * @return
     */
    fun getGovernorBirthday(): ZonedDateTime? = governor!!.getBirthday()

    /**
     * Set governor age
     *
     * @param birthday
     */
    fun setGovernorAge(birthday: ZonedDateTime){
        governor!!.setBirthday(birthday)
    }

    /**
     * Get name
     *
     * @return
     */
    fun getName(): String? = name

    /**
     * Set name
     *
     * @param name
     */
    fun setName(name: String) {
        this.name = name
    }

    /**
     * Get id
     *
     * @return
     */
    fun getId(): Long? = id

    /**
     * Set id
     *
     * @param id
     */
    fun setId(id: Long?) {
        this.id = id
    }

    /**
     * Get creation date
     *
     * @return
     */
    fun getCreationDate(): LocalDateTime? = creationDate

    /**
     * Set creation date
     *
     * @param creationDate
     */
    fun setCreationDate(creationDate: LocalDateTime?) {
        this.creationDate = creationDate
    }

    /**
     * Get climate
     *
     * @return
     */
    fun getClimate(): Climate? = climate

    /**
     * Set climate
     *
     * @param climate
     */
    fun setClimate(climate: Climate){
        this.climate = climate
    }

    /**
     * Get government
     *
     * @return
     */
    fun getGovernment(): Government? = government

    /**
     * Set government
     *
     * @param government
     */
    fun setGovernment(government: Government){
        this.government = government
    }

    /**
     * Get agglomeration
     *
     * @return
     */
    fun getAgglomeration(): Double? = agglomeration

    /**
     * Set agglomeration
     *
     * @param agglomeration
     */
    fun setAgglomeration(agglomeration: Double){
        this.agglomeration = agglomeration
    }

    /**
     * Get area
     *
     * @return
     */
    fun getArea(): Int? = area

    /**
     * Set area
     *
     * @param area
     */
    fun setArea(area: Int){
        this.area = area
    }

    /**
     * Get population
     *
     * @return
     */
    fun getPopulation(): Long? = population

    /**
     * Set population
     *
     * @param population
     */
    fun setPopulation(population: Long) {
        this.population = population
    }



}