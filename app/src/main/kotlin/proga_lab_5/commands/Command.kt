package proga_lab_5.commands

import proga_lab_5.commands.tools.Result

/**
 * Command
 *
 * @constructor Create empty Command
 */
interface Command {
    /**
     * Comply
     *
     * @param variables
     * @return
     */
    fun comply(variables: HashMap<String, Any>): Result

    /**
     * Get description
     *
     * @return
     */
    fun getDescription(): String

    /**
     * Get name
     *
     * @return
     */
    fun getName(): String

    /**
     * Arg contract
     *
     * @param arguments
     * @return
     */
    fun argContract(arguments : List<String>): HashMap<String, Any>

    /**
     * Args info
     *
     * @return
     */
    fun argsInfo(): HashMap<String, Int>
}