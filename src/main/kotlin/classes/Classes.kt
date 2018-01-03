package classes

fun main(args: Array<String>) {
    val william = Developer(name = "LEEMANS", firstName = "William")
    val francis = Developer(name = "GRUCHALA", firstName = "François")

    println(william.name)
    println(francis)
    println("Are we equals ? ${francis == william}") // === pour un check par référence

    francis.skills.add(Skill(1, "Kotlin", 2))
    println(francis)

    val a = A()
    println("A : ${a.tada()}")

    val b = B()
    println("B : ${b.tada()}")
}