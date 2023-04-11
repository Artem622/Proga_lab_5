package proga_lab_5.city

import java.time.LocalDateTime
import java.util.LinkedList

class Collection<T>: LinkedList<T>() {
    private var creationTime: LocalDateTime? = LocalDateTime.now()

    fun getCreationTime(): LocalDateTime? = creationTime
    fun setCreationTime(creationTime: LocalDateTime? ) {
        this.creationTime = creationTime
    }
}