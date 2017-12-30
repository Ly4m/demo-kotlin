
fun main(args: Array<String>) {
    valOrVarThatIsTheQuestion()
    defineATypeIsTooMainstream()
    whenIGrowUpIWillWantToBeABuilderOfString()
    returnIsUseless()
}

/**
 * @link https://kotlinlang.org/docs/reference/basic-syntax.html#defining-variables
 */
fun valOrVarThatIsTheQuestion() {
    val readOnly: String
    readOnly = "Hi, have a beautiful day"
    // readOnly = "ERROR"

    var ninjaTurtle: String
    ninjaTurtle = "Leonardo"
    ninjaTurtle += ", Donatello"
    ninjaTurtle += ", Michelangelo"
    ninjaTurtle += " & Raphael"

    println(ninjaTurtle)
}

/**
 * @link https://kotlinlang.org/docs/reference/properties.html
 */
fun defineATypeIsTooMainstream() {
    // Same as @see valOrVarThatIsTheQuestion#readOnly
    val readOnlyInOneLine: String = "world"

    // Same as just before
    val readOnlyWithoutType = "world"
}

/**
 * @link https://kotlinlang.org/docs/reference/basic-types.html#string-templates
 */
fun whenIGrowUpIWillWantToBeABuilderOfString() {
    val text = "world"

    println("text is a String : ${text is String}")
    println("hello $text")
}

/**
 * @link https://kotlinlang.org/docs/reference/control-flow.html#if-expression
 */
fun returnIsUseless() {
    val oneNumber = 3
    val otherNumber = 2
    val maxBetweenOneNumberAndOtherNumber = if(oneNumber > otherNumber) oneNumber else otherNumber

    println("Who has the biggest between $oneNumber and $otherNumber is : $maxBetweenOneNumberAndOtherNumber")
}



