package com.huni.kotlin.practice


class MainSample {
    fun start(temp:String) {
        SampleLogic().list(temp) {
            println("test - $it" )
        }
    }

    fun startTemp(temp: String) {
        val result = SampleLogic().listTemp(temp)
        println(result)
    }
}

fun main() {
    val tempInit = MainSample()

    println("Use Result ---------------------------")
    //////////////////////////////////////////////////////////////
    println("Success Test")

    tempInit.start("test")

    println("Fail Test")

    tempInit.start("test2")
    println("---------------------------")


}