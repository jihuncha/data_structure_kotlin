package com.test

fun main() {
//    University(r)

//    var temp = mutableListOf<Int>(1,2)
//
//
//    for(data in temp){
//        println(data)
//        var temp = data.plus(1)
//        println(temp)
//    }
//
//    println(temp)

    var map = mutableMapOf<String, Int>("b" to 1, "a" to 2)
    println(map)
    var resultMap = map.toSortedMap()

    for(test in resultMap){
        println(test.value)
    }
}
//
//class University(private val repository: Repository<Student>) {
//    fun getPaidCoursesWithTheNumbersOfSubscribedStudents(coursesCount: Int): Map<Course, Int> =
//        TODO("Implement your solution here")
//
////    Mutable
//
//
//}
//
//
//interface Repository<T> {
//    fun get(): Iterable<T>
//}
//
//data class Student(val id: Id, val name:String, val subscribersCourses:List<Course>)
////
//data class Student(val id: Id, val name:String, val isPaid: Boolean)
//
//typealias Id = Int
//
//data class Course {



//}


//package com.codility

//class University(private val repository: Repository<Student>) {
//    // fun getPaidCoursesWithTheNumbersOfSubscribedStudents(coursesCount: Int): Map<Course, Int> {
//    fun getPaidCoursesWithTheNumbersOfSubscribedStudents(coursesCount: Int) {
//        //list 생성
//        var myList = repository.get()
//
//        //과목 / count
//        var hashMap = HashMap<String, Int>()
//
//        // hashmap 만들기
//        for (data in myList){
//            for (courseData in data.subscribedCourses){
//                if(courseData.isPaid) {
//                    if (hashMap.containsKey(courseData.name)) {
//                        var temp = hashMap.get(courseData.name)!!.plus(1)
//                        hashMap.put(courseData.name, temp)
//                    } else {
//                        hashMap.put(courseData.name, 1)
//                    }
//                }
//            }
//        }
//
//        // 이름기준으로 우선 정렬
//        var resultMap = hashMap.toSortedMap()
//        // value 기준으로 정렬
//        var sortedByValue = resultMap.toList().sortedWith(compareBy({it.second})).toMap()
//
//
//    }
//}

