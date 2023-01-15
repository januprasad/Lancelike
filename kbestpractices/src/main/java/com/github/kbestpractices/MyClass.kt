package com.github.kbestpractices

class MyClass

fun main() {
    val user = getCurrentUser()
    var x = ::handleUser
    x(user)
    x(user)
    x(user)
    x(user)
    x(user)
}

fun handleUser(user: User?) {
    val user: User? = getCurrentUser()
    user?.name?.let { log(it) }
}

fun getCurrentUser(): User? {
    // assume it is from API server
    return User(
        name = "John Doe",
        id = 1,
        age = 25
    )
}
