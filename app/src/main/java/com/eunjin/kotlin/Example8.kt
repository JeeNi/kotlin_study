package com.eunjin.kotlin

fun main() {
    var name : String = "은진"
    var number : Int = 10

    var nickname : String? = "코코"
    var secondNumber : Int? = null

//    val result = if (nickname == null) {
//        "값이 없음"
//    } else {
//        nickname
//    }
    nickname = null
    var size = nickname?.length

    println(size)
}