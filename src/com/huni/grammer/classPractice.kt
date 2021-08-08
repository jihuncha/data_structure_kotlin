package com.huni.grammer

//8. class
//class 이름 파일이름 안맞아도됨
//한 파일안에 여러가지 class 가능

//생성자 -> constructor
//class Human constructor(val name: String){
//default 값도 줄수 있다
open class Human (val name: String = "Anonymous") {

    //인자에 val 붙여서 하면된다 하기처럼 쓸 필요 없음
//    val name :String = name

    //코드 블록을 넣고 싶으면 init 사용
    init {
        println("new Human has been born!!")
    }

    //부 생성자 생성
    //부 생성자는 항상 주 생성자에게 위임을 받아야한다.
    //this(name) 부분 추가
    //주 생성자가 없으면 위임 해줄 필요가 없다
    constructor(name: String, age : Int) :this(name){
        println("my name is ${name}, ${age} years old")
    }

    fun eattingCake() {
        println("This is so YUMMY~")
    }

    open fun singASong() {
        println("lalala")
    }
}

//상속
// extends 대신에 : Human
// 코틀린의 클래스는 기본적으로 final 이라서 안됨
// human class 를 open 을 해줘야함
class Korean : Human() {
    
    //그냥 하면 안됨..
    //open
    override fun singASong() {
        //기존 fun 사용하고 싶으면
        super.singASong()
        println("라라라~")
        println("my name is ${name + "님이다"}")
    }
}

fun main() {
    //new 필요없음
//    var human = Human("jihun")
//    human.eattingCake()
//
//    println("this human name is ${human.name}")
//
//    var human_none = Human()
//
//    println("human_none is ${human_none.name}")

    //초기화만 해줘도 출력됨
//    val test = Human("test1", 1234)

//    println(test)

    val korean = Korean()
    korean.singASong()
}