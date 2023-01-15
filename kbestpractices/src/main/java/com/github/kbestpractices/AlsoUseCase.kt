package com.github.kbestpractices

import java.util.Calendar

val currentYear = Calendar.getInstance().weekYear
fun main() {
    val jake = Person("Jake", 30, "Android developer") // 1
        .also { // 2
            writeCreationLog(it) // 3
        }

    with(jake) {
        log(currentYear - age)
    }
}

fun writeCreationLog(p: Person) {
    log(p)
}

data class Person(val name: String, val age: Int, val job: String)
