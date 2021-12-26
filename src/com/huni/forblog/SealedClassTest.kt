package com.huni.forblog

fun main() {
    //추상 클래스 사용
    println(getColor(MyColor.Blue()))

    //SealedClass 사용
    println(getColor(MyColorSealed.Red))
}

//추상 클래스 사용의 경우 else를 사용해야 에러가 나지 않는다!!
fun getColor(myColor: MyColor) : String {
    return when(myColor) {
        is MyColor.Red -> {
            "RED!!!"
        }
        is MyColor.Blue -> {
            "Blue!!!"
        }
        is MyColor.Green -> {
            "Green!!!"
        }
        else -> {
            "else!!"
        }
    }
}

//else 없이 사용 가능 -> 에러를 방지할 수 있음
fun getColor(myColor: MyColorSealed) : String {
    return when(myColor) {
        is MyColorSealed.Red -> {
            "RED!!!"
        }
        is MyColorSealed.Blue -> {
            "Blue!!!"
        }
        is MyColorSealed.Green -> {
            "Green!!!"
        }
    }
}

abstract class MyColor {
    class Red: MyColor()
    class Blue: MyColor()
    class Green : MyColor()
}

sealed class MyColorSealed {
    object Red : MyColorSealed()
    object Blue : MyColorSealed()
    object Green : MyColorSealed()

    //class 사용 가능 -> 그렇기에 인자도 사용
//    class TestColor (addColor:Int, addColorSecond:Int): MyColorSealed()
}

