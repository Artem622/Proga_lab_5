package proga_lab_5.commands

class TestCommand : Command {

    private var argument:Int = 0

    override fun comply() {
        println("$argument + боб?")
    }
    override fun getDescription(): String {
        return "Тестовая команда"
    }
    override fun getName(): String {
        return "test"
    }
    override fun setArgument(arg : String){
         argument = arg.toInt()
    }
}