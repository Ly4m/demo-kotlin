import com.sun.glass.ui.Size

fun sizeMultiplier(message: String, multiplier: Int = message.length) =
        multiplier * message.length

fun main(args: Array<String>) {
    //    println(sizeMultiplier("coucou", 5))
    //    println(sizeMultiplier("optional"))
    //    println(sizeMultiplier(multiplier = 1, message = "one"))

    fun foo(counter: Int = 1, aFunction: () -> Unit) {
        require(counter > 0) { "Counter must be positive" }
        (1..counter).forEach {
            aFunction()
        }
    }

    foo(2) {
        println("coucou")
    }
}