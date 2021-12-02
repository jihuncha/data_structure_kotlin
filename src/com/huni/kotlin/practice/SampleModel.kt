package com.huni.kotlin.practice

class SampleModel {
    fun testLogic(temp:String, completed: (Result<String>) -> Unit) {
        if (temp.equals("test")) {
            completed(Result.success("test"))
        } else {
            val exception:Exception = NullPointerException()
            completed(Result.failure(exception))
        }
    }
}