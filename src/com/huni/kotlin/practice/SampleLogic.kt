package com.huni.kotlin.practice

class SampleLogic {
    fun list(temp: String, completed: (Int) -> Unit) {
        println("list - $temp and completed - $completed")
        SampleModel().testLogic(temp) {
            if (it.isSuccess) {
                completed(123)
            } else if (it.isFailure) {
                println("Error!!")
                completed(456)
            }
        }
    }

    fun listTemp(temp:String): String {
        println("listTemp - $temp")

        return "123"
    }
}