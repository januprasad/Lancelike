package com.github.kbestpractices


val log: (Any) -> Unit = { println(it) }

fun <T> timeIt(message: String = "", block: () -> T): T {
    val start = System.currentTimeMillis()
    val r = block()
    val end = System.currentTimeMillis()
    println("$message: ${end - start} ms")
    return r
}