package com.eunjin.kotlin.part0.chapter2

fun main() {
    // let, main, apply, also, with
    // let
    val a = 3
    a.let {  }
//    val user = User("박은진", 10, true)

    // 1. let
    // 수신객체.let{ user ->
    //
    // 마지막 줄 // return
    // }
    val user: User? = User("박은진", 10, true)
    val age = user?.let {
        it.age
    }
    println(age)
    // 2. run
    // 수신객체.run { this ->
    //
    // 마지막 줄
    // }
    var kid = User("아이", 4, false)
    val kidAge = kid.run {
        age
    }
    println(kidAge)
    // 3. apply
    // 수신객체.apply { this ->
    // 어떤 값이든 상관없음
    // }
    // return 값이 수신객체
    val female = User("슬기", 20, true, true)
    val femaleValue = female.apply {
        hasGlasses = false
    }
    println(femaleValue.hasGlasses)
    // 4. also
    // 수신객체.also { it -> local variable
    //
    //
    // } // return 수신객체(자기자신)
    val male = User("민수", 17, false, true)
    var maleValue = male.also {
        println(it.name)
    }
    // 5. with
    // with(수신객체) {
    // ---
    // 마지막줄
    // }
    val result = with(male) {
        hasGlasses = false
        true
    }
}

class User(
    val name: String,
    val age: Int,
    val gender: Boolean, // true: female, false: male
    var hasGlasses: Boolean = true
)