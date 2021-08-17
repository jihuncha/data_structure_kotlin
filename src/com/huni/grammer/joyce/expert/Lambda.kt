package com.huni.grammer.joyce.expert

// 1. lambda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명 함수 이다.
// 1) 메소드에 파라미터로 넘겨줄수가 있다. fun maxBy(a:Int) -> a:Int에 function을 이용할 수 있다
// 2) return 값으로 function을 쓸 수가 있다. (javascript 형태)

// 람다의 기본 정의
// val lambdaName: Type = {argumentList -> codeBody]


// integer 제곱
val square : (Int) -> (Int) = {number -> number * number}

val nameAge = {name:String, age: Int ->
    "My name is ${name} I'm ${age}"
}

fun main() {
    println(square(12)) //144
    println(nameAge("jihun", 32))

    //확장
    val a=  "joyce said"
    val b = "mac said"
    // String의 확장 함수
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 27))

    println(calculateGrade(1000))


    //람다를 표현하는 여러가지 방법
    val lambda = {number: Double ->
        number == 4.3212
    }

    println(invokeLambda(lambda))
    //람다 리터럴
    println(invokeLambda({it > 3.22}))
    //중괄호 모드가 있음 위에 식과 똑같음
    //코틀린에서 많이 나옴 -> 마지막 parameter가 람다식일떄
    println(invokeLambda { it > 3.22 })






}

// 확장함수
// ex) String에서 확장함수 만들기

val pizzaIsGreat : String.() -> String = {
    //return 값
    this + "Pizza is th Best!!!"
}

fun extendString(name: String, age:Int) : String {
    //파라미터가 하나 일때는 it을 사용 가능
    val introduceMySelf : String.(Int) -> String = {"I'am ${this} and ${it} years old"}
    return name.introduceMySelf(age)
}

//람다의 return

val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "Fail"
        in 41.. 70 -> "Pass"
        in 71 .. 100 -> "Perfect"
        else -> "error!"
    }
}

//람다를 표현하는 여러가지 방법
//1.
fun invokeLambda(lambda: (Double) -> Boolean) : Boolean {
    return lambda(5.2342)
}

//익명 내부 함수
//1. java interface 여야한다.
//2. 그 인터페이스는 꼭 하나의 메서드를 가져야한다.
