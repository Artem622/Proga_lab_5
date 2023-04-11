package proga_lab_5.city

import java.time.LocalDateTime
import java.util.LinkedList

class CityCollection {

    private val collection = LinkedList<City>()
    private var creationTime: LocalDateTime? = LocalDateTime.now()
    fun getCollection() : LinkedList<City>{
        return collection
    }
    fun add(city : City) {
        collection.add(city)
    }

    fun getCreationTime(): LocalDateTime? = creationTime
    fun setCreationTime(creationTime: LocalDateTime? ) {
        this.creationTime = creationTime
    }
}