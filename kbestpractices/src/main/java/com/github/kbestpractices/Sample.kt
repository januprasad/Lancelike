package com.github.kbestpractices

abstract class Grandfather {
    open var num = 1

    init {
        println("Grandfather $num")
    }

    fun printNum() {
        println("Grandfather $num")
    }
}

open class Dad : Grandfather() {
    override var num = 2
//    override fun printNum() {
//        println("Dad $num")
//    }
}

open class Child : Dad() {
    override var num = 3
//    override fun printNum() {
//        println("Child $num")
//    }
}

open class ChildX : Child() {
//    override fun printNum() {
//        println("ChildX $num")
//    }
    override var num = 4
}

fun main() {
    ChildX().apply {
        printNum()
    }
}

/** output
Grandfather 0
Dad 0
Child 0
ChildX 4
 */
