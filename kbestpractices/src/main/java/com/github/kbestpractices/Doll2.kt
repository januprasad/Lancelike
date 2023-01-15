package com.github.kbestpractices

// set 1
fun main() {
    repeat(5) {
        log(rollDice())
    }
}

fun rollDice(): Int = (1..6).random()
