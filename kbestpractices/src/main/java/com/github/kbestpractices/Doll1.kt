package com.github.kbestpractices

fun main() {
    rollDice(time = 3) {
        log(it)
    }
}

fun rollDice(dice: IntRange = 1..6, time: Int, callback: (Int) -> Unit) {
    repeat(time) {
        callback(dice.roll())
    }
}

inline fun IntRange.roll() = this.random()
