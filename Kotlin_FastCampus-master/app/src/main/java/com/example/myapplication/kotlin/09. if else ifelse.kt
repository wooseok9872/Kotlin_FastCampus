package com.example.myapplication.kotlin

fun main(args: Array<String>) {

    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 110) {
        println("b+c=110")
    } else {
        println("b+c is not 110")
    }

    // 엘비스 연산자 number가 null일 경우 10대입, 아닐경우 100 대입
    val number: Int? = null
    val number2 = number ?: 10
    println()
    println(number2)



    val num1: Int = 10
    val num2: Int = 20

    val max = if (num1 > num2) {
        num1
    } else if (num2 > num1) {
        num2
    } else {
        100
    }
    println()
    println(max)
}
