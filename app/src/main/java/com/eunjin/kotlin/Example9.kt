package com.eunjin.kotlin

fun main() {
    cast("안녕")
    cast(10)
}

fun check(a: Any): String {
    return when (a) {
        is String -> {
            "문자열"
        }
        is Int -> {
            "숫자"
        }
        else -> {
            "몰라요"
        }
    }
}
fun cast(a: Any) {
    val result = a as? String
    println(result)
}