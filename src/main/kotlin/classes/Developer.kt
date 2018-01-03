package classes

data class Developer(
        var id: Long? = null,
        var name: String,
        var firstName: String,
        var skills: MutableList<Skill> = mutableListOf())
