package com.huni.grammer

//class practice_basic {
//
//
//}

fun main(){
//    helloWorld()
//
//    println(add(3,6))

//    string_templete()

//    checkNumber(3)

//    forAndWhile()

    nullcheck()
}

//1. 함수

// Unit = void
fun helloWorld() : Unit {
    println("hello kotlin")
}

//변수이름 - 변수타입 순서로 해준다.
fun add(a : Int, b: Int) : Int {
    return a + b
}

//2. val var
//val = value : 불변
//var = variable : 가변

fun hi() {
    val a : Int = 10
    var b : Int = 9

    //val can not be reassigned
//    a = 11
    b = 100
//    println(b)

    //자동 형변환 가능 (Int 안적어도됨)
    val c = 10
    var d = 100

    var name : String = "jihun"

}

//3. String 템플릿
// 변수를 출력하고 싶을때 $표시 사용
fun string_templete() {
    val name = "jihun"
    val lastName = "Cha"
    println("my name is $name")
    //대괄호를 사용해서 구분가능 (띄어쓰기말고)
    println("my name is ${name}aaaa")

    println("my name is ${name + lastName}")
    // $ 문자 쓰고싶을떄 \(백슬래쉬) 사용
    println("This is 28\$a")
}

//4. 조건식
fun maxBy(a:Int, b:Int) : Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
// 코틀린 style
fun maxBy2 (a:Int, b:Int) : Int = if(a>b) a else b

//when (switch)
fun checkNumber(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is $score")
        else -> println("else all!!")
    }

    //return 식처럼 가능 -> else는 무조건 써줘야한다
    var b : Int = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b - $b")

    when(score) {
        in 90..100 -> println("good")
        in 80..90-> println("not bad")
        else -> println("OK")
    }
}

//Expression && Statement

//어떤 행위를 해서 값을 만들면 -> Expression
fun maxBy3 (a:Int, b:Int) : Int = if(a>b) a else b

//어떤 행위를 해서 값을 만들지 않는 경우는 Statement (문장으로써 쓰임)

//코틀린의 모든 함수는 Expression (Unit을 반환하기 떄문..)


//5. array / list
// array - 메모리가 이미 할당되있음
// list - 1. immutable list / 2. mutable list

fun array() {
    //배열과 리스트의 초기화
    val array = arrayOf(1,2,3)
    val list : List<Int> = listOf(1,2,3)

    //any type 으로 추론됨
    val array2 : Array<Any> = arrayOf(1, "a", 3.4f)
    val list2 = listOf(1, "b", 3L)

    //array의 경우 값을 변경 가능
    array[0] = 3
    //list 는 변경 불가
//    list.get(0) = 2

    //mutablelist의 대표적인 예시
    //arrayList 의 참조값자체는 변하지 않아서 val 써도 된다.
    val arrayList:ArrayList<Int> = arrayListOf<Int>()
//    var arrayList:ArrayList<Int> = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}

//6. 반복문 for / while
fun forAndWhile() {

    val students = arrayListOf("abc", "haha", "ggg", "jennifer")

    for (name in students) {
//        println(name)
        println("$name")
    }

    //index와 value 함께 사용 -> withIndex
    for ((index, student) in students.withIndex()) {
        println("test - ${index + 1} and studend - $student")
    }

    var sum : Int = 0
    // step 을 사용하면 step 만큼 띄어서 실행
    for (i in 1..10 step 2) {
//        println(i)
        sum += i
    }
    println(sum)

    //10 부터 1
    for (i in 10 downTo 1) {
//        println(i)
    }

    //1 ~ 99
    for (i in 1 until 100) {
//        println(i)
//        sum += i
    }

    var index = 0
    while (index < 10) {
        println("currentIndex - ${index}")
        index++
    }
}

//7. NonNull and Nullable
fun nullcheck() {
    // NPE : NULL Point Exception

    var name:String = "jihun"

    //그냥 쓰면 에러 발생 -> ?를 붙여서 nullable type
    //그러므로 type 을 생략하면 안된다
//    var nullName : String = null
    var nullName : String? = null

    var nameInUpperCase = name.toUpperCase()

    //null인지 아닌지 몰라서 에러가 뜬다..
    //nullName?.touppercase -> null 아니면 uppercase되고 아니면 null 을 반환
//    var nullNameUpperCase = nullName.toUpperCase()
    var nullNameUpperCase = nullName?.toUpperCase()

    // ?: (엘비스 연산자)
    // ? 는 null 반환하지만 -> default깞을 반환하고 싶을떄
    val lastName : String? = null

    val fullName : String = name + " " + (lastName?: "No LastName")

    println(fullName)

    // !!
    // 이건 null이 아니라고 선언
    ignoreNull("dsada")
}

fun ignoreNull (str: String?) {
    //null 일수도 있어서 에러
//    val mNotNull : String = str

    //null 이 아니라고 명시
    val mNotNull : String = str!!
    val upper = mNotNull.uppercase()
//    println(upper)


    //let
    //자신의 receiver 객체를 lambda 식 내부로 옮겨서 사용
//    val email: String? = "abcd@nana.com"
    val email: String? = null
    //email 이 null이 아니면 scope안에 옮겨줌
    email?.let {
        println("email is ${email}")
    }
}

//8. class
