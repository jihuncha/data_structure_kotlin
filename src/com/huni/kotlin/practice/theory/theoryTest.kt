package com.huni.kotlin.practice.theory

class theoryTest {

}

fun main() {
    val adam = Person("Adam").apply {
        age = 20
        city = "London"
    }

    val huni = Person("Huni")

//    println(adam)
//    println(adam.age)
//    println(adam.city)
//
//    println(huni)
//    println(huni.age)
//    println(huni.city)

//    val numbers = mutableListOf("one", "two", "three")
//    println(numbers)
//    numbers.also {
//        println("The list elements before adding new one: $it")
//    }.add("four")
//    println(numbers)

//    [one, two, three]
//    The list elements before adding new one: [one, two, three]
//    [one, two, three, four]


//    val str: String? = "Hello"
//    val length = str?.let {
//        println("let() called on $it")
//        it.length
//    }
//
//    println(length)
//
//    val temp:String? = null
//    val tempLength = str.let {
//        //No Print
//        println("temp1")
//    }

//    let() called on Hello
//            5
//    temp1


//    val numbers = mutableListOf("one", "two", "three")
//    val countEndsWithE = numbers.run {
//        add("four")
//        add("five")
//        count {
//            it.endsWith("e")
//        }
//    }
//
//    println("numbers: " + numbers)
//    println("There are $countEndsWithE elements that end with e.")

    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }

    val numbersTest = mutableListOf<String>()
    with(numbersTest) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }

    //    'with' is called with argument [one, two, three]
//    It contains 3 elements
//    'with' is called with argument []
//    It contains 0 elements
}

// result
//    Person(name=Adam)
//    20
//    London
//    Person(name=Huni)
//    0

data class Person(val name: String) {
    var age: Int = 0
    var city: String = ""
}

