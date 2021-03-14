  package com.example.myapplication.kotlin

import java.security.KeyStore

fun main(array: Array<String>) {
    first()
    println(second(78))
    println(third(89))
    gugudan()
}

fun first() {
    val a = MutableList(9, { 0 })
    for (item in 0..8) {
        a[item] = item
    }
    println(a)

    val b = MutableList(9, { true })
    for (i in 0..8) {
        if (i % 2 == 0) b[i] = false
        else b[i] = true
    }
    println(b)
}

fun second(score: Int): String {
    if (score in 80..90) {
        return "A"
    } else if (score in 70..79) {
        return "B"
    } else if (score in 60..69) {
        return "C"
    } else {
        return "F"
    }
}
/*
fun second(score: Int): String {
    var result: String = "F"
    when (score) {
        in 90..100 -> {
            result= "A"
        }
        in 80..89 -> {
            result= "B"
        }
        in 70..79 -> {
            result= "C"
        }
    }
    return result
}
*/

fun third(num: Int): Int {
    val a: Int = num / 10
    val b: Int = num % 10
    val sum: Int = a + b
    return sum
}

fun gugudan(){
    for(i in 2..9){
        for(j in 1..9){
            println("$i x $j = ${i*j}")         //묶고 싶은게 있을 때는 중괄호로 사용
        }
    }
}