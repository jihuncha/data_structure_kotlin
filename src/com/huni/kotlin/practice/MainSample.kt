package com.huni.kotlin.practice


class MainSample {
    fun start(temp:String) {
        SampleLogic().list(temp) {
            println("test - $it" )
        }
    }
}

fun main() {
    val tempInit = MainSample()

    println("Success Test")

    tempInit.start("test")

    println("Fail Test")

    tempInit.start("test2")
}