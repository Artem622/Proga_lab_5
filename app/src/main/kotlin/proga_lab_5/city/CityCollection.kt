package proga_lab_5.city

import java.time.LocalDateTime
import java.util.LinkedList

var arrayFreeId = emptyArray<Long>()

/**
 * City collection
 *
 * @constructor Create empty City collection
 */
class CityCollection {

    private val collection = LinkedList<City>()
    private var creationTime: LocalDateTime? = LocalDateTime.now()
    private var maxId : Long = 0

    /**
     * Get collection
     *
     * @return
     */
    fun getCollection() : LinkedList<City>{
        return collection
    }

    /**
     * Add
     *
     * @param city
     */
    fun add(city : City) {
        collection.add(city)
    }

    /**
     * Get creation time
     *
     * @return
     */
    fun getCreationTime(): LocalDateTime? = creationTime

    /**
     * Set creation time
     *
     * @param creationTime
     */
    fun setCreationTime(creationTime: LocalDateTime? ) {
        this.creationTime = creationTime
    }

    /**
     * Get free id
     *
     * @return
     */
    fun getFreeId() : Long{
        return if (arrayFreeId.isNotEmpty()){
            val id = arrayFreeId[0]
            arrayFreeId = removeFirstItem(arrayFreeId)
            id
        }else{
            maxId += 1
            maxId
        }
    }
    private fun removeFirstItem(array: Array<Long>): Array<Long> {
        return array.copyOfRange(1, array.size)
    }
}