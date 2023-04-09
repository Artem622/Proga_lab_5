package proga_lab_5.city

class Coordinates {
    private var x: Long
    private var y: Long
    constructor(x:Long, y:Long){
        this.x = x
        this.y = y
    }

    fun getX(): Long = x

    fun setX(x:Long){
        this.x = x
    }

    fun getY(): Long = y

    fun setY(y: Long){
        this.y = y
    }

    override fun toString(): String = "(" + x + ";" + y + ")"
}