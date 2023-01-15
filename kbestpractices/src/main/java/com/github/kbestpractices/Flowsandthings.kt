package com.github.kbestpractices

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import java.lang.Thread.sleep

class Flowsandthings

fun main() = runBlocking {
    println("flowTest")
    flowTest()
    println("Done")
}
suspend fun flowTest() {
    delay(1000L)
    println("emiting")
    val myIntFlow: Flow<Int> = flow { emit(1) }
    delay(1000L)
    println("collecting")
    myIntFlow.collect { int -> println(int) }
}
