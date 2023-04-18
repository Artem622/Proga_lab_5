package proga_lab_5.city

/**
 * Coordinates
 *
 * @property x
 * @property y
 * @constructor Create empty Coordinates
 */
class Coordinates(private var x: Long, private var y: Float) {

    /**
     * Get x
     *
     * @return
     */
    fun getX(): Long = x

    /**
     * Set x
     *
     * @param x
     */
    fun setX(x:Long){
        this.x = x
    }

    /**
     * Get y
     *
     * @return
     */
    fun getY(): Float = y

    /**
     * Set y
     *
     * @param y
     */
    fun setY(y: Float){
        this.y = y
    }

    override fun toString(): String = "($x;$y)"
}