package com.example.myapplication.kotlin

fun plusThree(first: Int, second: Int, third: Int): Int {
    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first: Int = 1, second: Int = 1, third: Int = 1): Int {
    return first * second * third
}

fun main(array: Array<String>) {
    val result = plusThree(1, 2, 3)
    println(result)
    val result2 = minusThree(10, 2, 3)
    println(result2)
    val result3 = multiplyThree(2, 2, 2)
    println(result3)
    val result4 = multiplyThree(3)
    println(result4)

}
