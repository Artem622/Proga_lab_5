package proga_lab_5.city

import java.time.ZonedDateTime
import java.util.Date

class Human {
    private var age: Int
    private var birthday: ZonedDateTime

    constructor(age:Int, birthday: ZonedDateTime){
        this.age = age
        this.birthday = birthday
    }

    fun getAge():
          Int = age

    fun setAge(age: Int){
        this.age = age
    }

    fun getBirthday():
            ZonedDateTime= birthday

    fun setBirthday(birthday: ZonedDateTime){
        this.birthday = birthday
    }

    override fun toString(): String ="$age,$birthday"
}
