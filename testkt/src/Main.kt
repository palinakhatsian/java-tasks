fun main() {
    val user = User(
        id = "123",
        username = "testUser",
        email = "test@email.com"
    )
    val serializedString = user.toString()
    println(serializedString)
    val deserUser = deserializeFrom(serializedString)
    println(deserUser)
}

fun deserializeFrom(string: String): User {
    val parameters = string.split('/')
    return User(
        id = parameters[0],
        username = parameters[1],
        email = parameters[2]
    )
}

data class User(
    private val id: String,
    private val username: String,
    private val email: String
) {
    init {
        println("User created!")
    }

    override fun toString(): String {
        return "${this.id}/${this.username}/${this.email}"
    }
}


