package com.example.myapplication.kotlin

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //반복하는 방법 (1)
    for (item in a) {
        if (item == 5) println("item is Five")
        else println("item is not five")
    }
    println()

    //반복하는 방법 (2)
    for ((index, item) in a.withIndex()) {
        println("index: " + index + " value: " + item)
    }
    println()

    //반복하는 방법 (3)
    a.forEach {
        println(it)
    }
    //반복하는 방법 (4)
    a.forEach { item ->
        println(item)
    }
    println()

    //반복하는 방법 (5)
    a.forEachIndexed { index, item ->
        println("index: " + index + " value: " + item)
    }
    println()

    //반복하는 방법 (6)
    for (i in 0 until a.size) {
        println(a.get(i))
    }                           //until은 마지막을 포함 하지 않는다. a.size는 9
    println()

    //반복하는 방법 (7)
    for (i in 0 until a.size step (2)) {
        println(a[i])
    }
    println()

    //반복하는 방법 (8)
    for (i in a.size - 1 downTo (0)) {
        println(a[i])
    }
    println()

    for (i in 0..10) {
        println(i)
    }                           // ..은 마지막을 포함하고 until은 마지막을 포함하지 않는다.
    println()

    //반복하는 방법 (9)
    var b: Int = 0
    var c: Int = 4
    while (b < c) {
        println(b)
        b++
    }
    println()

    //반복하는 방법 (10)
    var d: Int = 0
    var e: Int = 4
    do {
        println("hello")
        d++
    } while (d < e)

}