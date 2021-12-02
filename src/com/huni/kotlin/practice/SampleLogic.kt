package com.huni.kotlin.practice

class SampleLogic {
    fun list(temp:String, completed: (Int) -> Unit) {
        println("list - $temp and completed - $completed")
        SampleModel().testLogic(temp) { result ->
                if (result.isSuccess) {
                    completed(123)
                } else if (result.isFailure) {
                    println("Error!!")
                    completed(456)
                }
        }
    }
}