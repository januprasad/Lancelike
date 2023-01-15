package com.github.kbestpractices

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) = runBlocking {

    var time = measureTimeMillis {
        val one = async { one() }
        val two = async { two() }
//        val int1 = one.await()
//        val int2 = two.await()
//        println(int1 + int2)

    }
//
//    println("$time ms")


//   val time = measureTimeMillis {
//        val one = async { one() }.await()
//        val two = async { two() }.await()
////        println(one + two)
//    }
//    println("$time ms")
}

suspend fun one() {
    delay(2000)
}

suspend fun two(){
    delay(1000)
}
