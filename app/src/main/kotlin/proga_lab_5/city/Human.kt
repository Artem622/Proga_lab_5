package proga_lab_5.city

import java.time.ZonedDateTime

/**
 * Human
 *
 * @constructor Create empty Human
 */
class Human {
    private var age: Int? = null
    private var birthday: ZonedDateTime? = null

    constructor()
    constructor(age: String, birthday: String){
        this.age = age.toInt()
        this.birthday = ZonedDateTime.parse(birthday)
    }


    /**
     * Get age
     *
     * @return
     */
    fun getAge():
            Int? = age

    /**
     * Set age
     *
     * @param age
     */
    fun setAge(age: Int){
        this.age = age
    }

    /**
     * Get birthday
     *
     * @return
     */
    fun getBirthday():
            ZonedDateTime? = birthday

    /**
     * Set birthday
     *
     * @param birthday
     */
    fun setBirthday(birthday: ZonedDateTime){
        this.birthday = birthday
    }

    override fun toString(): String ="возраст: $age, день рождения: $birthday"
}
