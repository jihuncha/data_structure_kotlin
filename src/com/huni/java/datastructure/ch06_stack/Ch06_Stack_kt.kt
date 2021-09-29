package com.huni.java.datastructure.ch06_stack

import java.util.*


fun main() {
    var stack : Stack<Int> = Stack()

    stack.push(1)
    stack.push(2)
    stack.push(3)

    stack.pop()

    println(stack.peek())
    println(stack)

    var array_check = arrayListOf<Int>()

    array_check.add(1)
    array_check.add(2)
    array_check.add(3)

    array_check.removeAt(array_check.size - 1)

    println(array_check)
}