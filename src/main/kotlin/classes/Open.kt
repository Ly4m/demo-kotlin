package classes

open class A {
    open fun tada(): String {
        return "Hello"
    }
}

class B: A() {
    override fun tada(): String {
        return "world"
    }
}