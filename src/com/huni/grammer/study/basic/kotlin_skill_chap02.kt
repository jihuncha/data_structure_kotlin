package com.huni.grammer.study.basic

import java.io.Serializable
import java.time.Instant
import javax.lang.model.element.Name

//1. 필드와 변수

//val -> 자바 final 
//String 생략가능 (타입 추론)

//val name: String = "Frank 현석 oh"

//가변필드
//최대한 사용안하는게 좋다 (참조가 가리키는 대상이 바뀌지 않으면 프로그램을 추론하기가 쉬움)
var name_second = "test 테스트 tete"

//지연 초기화

//사용이유
//참조 초기화를 늦추기 위해 (ex. 초기화 비용이 많이 들어서 참조를 실제롤 사용하기 전까지 초기화를 하고 싶지 않는 경우)

//일반적 해법
//var참조로 null로 초기화하고 나중에 의미 있는 값 대입

/*
var name: String? = null //만약 string으로 초기화할려고하면 null로 초기화할 수 없다.
name = getName()
*/

//코틀린 해법
/*
* val name : String by lazy {getName()}
* 
* val name: STring by lazy(::getName) //더블콜론 = 리플렉션
* 리플렉션(Reflection)이란
* 코틀린에서 더블콜론(::)은 리플렉션을 위해 사용한다.
* 리플렉션이란 코드를 작성하는 시점에는 런타임상 컴파일된 바이트 코드에서 내가 작성한 코드가 어디에 위치하는지 알 수 없기 때문에 바이트 코드를 이용해 내가 참조하려는 값을 찾기위해 사용한다.
*
*
//var x = 1024
//fun main() {
//    println(::x.get())
//    println(::x.name)
////    1024
////    x
//}
* */

fun main() {
    val name: String by lazy { getName() }
    println("안녕!!")
    val name2:String by lazy { name }
    println("안녕22")
    println(name)
    println(name2)
    println(name)
    println(name2)
}

fun getName(): String{
    println("이름 계산중~")
    return "ChaChaCha"
}

//2. 클래스와 interface

//class Person constructor(name_class: String) {
//    val name_class:String
//
//    init {
//        this.name_class = name_class
//    }
//}

//축약
//class Person (val name_class: String)

//인터페이스 구현 및 클래스 확장
//class 뒤에 나열한다.
//상속은 open 키워드 사용해야한다. (open class ...)

//class Person(
//    val name:String,
//    val resigtered:Instant
//) : Serializable,
//    Comparable<Person>{
//        override fun compareTo(other:Person):Int{
//            ...
//        }
//}

//3. 클래스 인스턴스화하기
//val person = Person("Bob", Instant.now())

//4. 프로퍼티 생성자 오버로드하기

// 오버로드 1
//class Person(val name: String, val registered:Instant = Instant.now())

// 오버로드 2
//class Person(val name: String, val registered:Instant = Instant.now()) {
//    constructor(name: Name) :this(name.toString()) {
//
//    }
//}

//비공개 생성자 -> class Person private constructor ~~~

//접근자와 프로퍼티 -> getter/setter 필요없이 .인자 로 받아오면된다.

//5. equals와 hashCode 메서드 만들기