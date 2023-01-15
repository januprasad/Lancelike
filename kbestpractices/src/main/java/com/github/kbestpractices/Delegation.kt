package com.github.kbestpractices

interface Singer { // 1
    fun sing()
}

class NormalSinger(val verbalVoice: String) : Singer {
    override fun sing() = println("$verbalVoice....")
}

class HighPitchSinger(val verbalVoice: String) : Singer {
    override fun sing() = println("$verbalVoice$verbalVoice$verbalVoice....")
}

class VidhuPratap(verbalVoice: String) : Singer by NormalSinger(verbalVoice)

class Yesudas(verbalVoice: String) : Singer by HighPitchSinger(verbalVoice)

fun main() {
    val yesudas = Yesudas("Gange ")
    yesudas.sing()
    val vidhuPratap = VidhuPratap("Mamma marimazhaye")
    vidhuPratap.sing()
}
