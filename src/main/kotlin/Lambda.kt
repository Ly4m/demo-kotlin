val numbers = listOf(1, 2, 3, 4, 5, 6)

fun main(args: Array<String>) {
    mapToString()
    reduce()
    filter()
    partition()
    descending()
    max()
}

fun mapToString() {
    val numbersInString = numbers.map { "0" + it }

    println("Numbers in String : $numbersInString")
}

fun reduce() {
    val numbersAdded = numbers.reduce { acc, i -> acc + i }
    // Same as ...
    val numbersAddedViaSum = numbers.sum()

    println("Numbers added : $numbersAdded")
    println("Numbers added : $numbersAddedViaSum")
}

fun filter() {
    val numbersFiltered = numbers.filter { it < 2 }

    println("Numbers lower than 2 : $numbersFiltered")
}

fun partition() {
    val (lowerThan, greaterThan) = numbers.partition { it < 4 }

    println("Numbers lower than 4 : $lowerThan")
    println("Numbers greater or equals than 4: $greaterThan")
}

fun descending() {
    val numbersOrdered = numbers
            .filter { it < 5 }
            .sortedDescending()

    println("Numbers in combo : $numbersOrdered")
}

fun max() {
    val max = numbers.max()

    println("Max of numbers : $max")
}