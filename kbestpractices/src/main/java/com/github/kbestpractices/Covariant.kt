package com.github.kbestpractices

open class Fruit

class Banana : Fruit()

interface ICovariantSkinned<out T>

interface ISkinned<T>

fun Peel(skinned: ISkinned<Fruit>) {}

fun Peel(skinned: ICovariantSkinned<Fruit>) {}

fun main() {
    var fruit: ICovariantSkinned<Fruit>? = null
    var banana: ICovariantSkinned<Banana>? = null
    Peel(fruit!!)
    Peel(banana!!)

    var fruit1: ISkinned<Fruit>? = null
    var banana1: ISkinned<Banana>? = null
    Peel(fruit1!!)
//    Peel(banana1!!)
}
