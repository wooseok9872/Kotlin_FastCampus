package com.example.myapplication.kotlin

fun main(array: Array<String>) {
    val array = arrayOf<Int>(1, 2, 3)

    val number = array.get(0)
    println(number)
    val number1 = array[2]
    println(number1)

    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('a', 'b') // char-> '', string-> ""
    val a3 = doubleArrayOf(1.2, 100.345)
    val a4 = booleanArrayOf(true, false)

}