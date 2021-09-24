package com.huni.java.fastcampus.ch04

fun main() {
    var array = arrayOf(1,2,3)

//    println(array.fo)

    array.forEach { print("$it ")  }

    println()

    var array_check = arrayOf(arrayOf(arrayOf(1,2,3), arrayOf(4,5,6)), arrayOf(arrayOf(7,8,9), arrayOf(10,11,12)))

    array_check.forEach { print("${it.contentDeepToString()} ") }

    println()

    println(array_check[1][0][1])

    check_string("M")

}

fun check_string(input:String) {
    var array_sample = arrayOf(
        "Braund, Mr. Owen Harris",
        "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
        "Heikkinen, Miss. Laina",
        "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
        "Allen, Mr. William Henry",
        "Moran, Mr. James",
        "McCarthy, Mr. Timothy J",
        "Palsson, Master. Gosta Leonard",
        "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
        "Nasser, Mrs. Nicholas (Adele Achem)",
        "Sandstrom, Miss. Marguerite Rut",
        "Bonnell, Miss. Elizabeth",
        "Saundercock, Mr. William Henry",
        "Andersson, Mr. Anders Johan",
        "Vestrom, Miss. Hulda Amanda Adolfina",
        "Hewlett, Mrs. (Mary D Kingcome) ",
        "Rice, Master. Eugene",
        "Williams, Mr. Charles Eugene",
        "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
        "Masselmani, Mrs. Fatima",
        "Fynney, Mr. Joseph J",
        "Beesley, Mr. Lawrence",
        "McGowan, Miss. Anna",
        "Sloper, Mr. William Thompson",
        "Palsson, Miss. Torborg Danira",
        "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
        "Emir, Mr. Farred Chehab",
        "Fortune, Mr. Charles Alexander",
        "Dwyer, Miss. Ellen",
        "Todoroff, r. Lalio"
    )

//    var count:Int = 0

    //이방식이 맞을것인가..?
    var temp = array_sample.filter { it.contains(input) }

    println(temp.size)
}