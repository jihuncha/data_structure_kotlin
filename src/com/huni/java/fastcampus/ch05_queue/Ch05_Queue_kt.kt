package com.huni.java.fastcampus.ch05_queue

//코틀린 표준 라이브러리인 kotlin std-lib에는 Queue가 구현되어 있는 라이브러리가 존재하지 않는다

//1. arrayList 를 Queue 처럼

//2. 자바의 큐 사용

import java.util.*

fun main() {
    var queue = arrayListOf<Int>()

    queue.add(1)
    queue.add(2)
    queue.add(3)

    //index 제거
    queue.removeAt(0)

    println(queue)

    var queue_java: Queue<Int> = LinkedList<Int>()

    queue_java.add(4)
    queue_java.add(5)
    queue_java.add(6)

    //맨앞 데이터 삭제
    queue_java.poll()

    println(queue_java)

    //맨앞데이터 확인
    println(queue_java.peek())
}




