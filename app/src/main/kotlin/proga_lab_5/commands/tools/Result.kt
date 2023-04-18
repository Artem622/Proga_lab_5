package proga_lab_5.commands.tools

/**
 * Result
 *
 * @property message
 * @property bool
 * @constructor Create empty Result
 */
class Result(private val message: String, private val bool: Boolean) {
    /**
     * Get bool
     *
     * @return
     */
    fun getBool(): Boolean {
        return this.bool
    }

    /**
     * Get message
     *
     * @return
     */
    fun getMessage(): String{
        return this.message
    }
}