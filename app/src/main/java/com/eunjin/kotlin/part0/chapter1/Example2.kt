package com.eunjin.kotlin

fun main() {
    val result = test(1, c = 5)
    test2(id = "진", name = "은진", nickname = "땡진")
    println(result)
    println(time1(1, 3))
    println(time2(1, 3))
}

// 2. 함수
fun test(a: Int, b: Int = 3, c: Int =4) : Int {
    println(a + b)
    return a + b
}

fun test2(name: String, nickname: String, id: String) = println(name + nickname + id)

fun time1(a: Int, b: Int) : Int {
    return a * b
}

fun time2(a: Int, b: Int) = a * b

