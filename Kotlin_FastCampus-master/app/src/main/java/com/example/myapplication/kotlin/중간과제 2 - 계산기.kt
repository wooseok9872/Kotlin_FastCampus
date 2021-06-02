package com.example.myapplication.kotlin

fun main(array: Array<String>) {
    val calutator1: Calculator1 = Calculator1()
    println(calutator1.plus(16, 5))
    println(calutator1.minus(16, 5))
    println(calutator1.multiply(16, 5))
    println(calutator1.divide(16, 5))
    println()

    val calculator2: Calculator2 = Calculator2()
    println(calculator2.plus(10, 1, 2, 5))
    println(calculator2.minus(10, 1, 2, 5))
    println(calculator2.multiply(10, 1, 2, 5))
    println(calculator2.divide(10, 1, 2, 5))
    println()

    val calculator3: Calculator3 = Calculator3(3)
    println(calculator3.plus(5).minus(5))

}

class Calculator1() {
    fun plus(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun minus(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Int {
        return num1 / num2
    }
}   //숫자 두개만 가능

class Calculator2() {

    fun plus(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {
            result = result + it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        for (i in 1 until numbers.size) {
            result = result - numbers[i]
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        for (num in numbers) {
            if (num != 0) result = result * num
        }
        return result
    }

    fun divide(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, value ->
            if (index != 0 && value != 0)
                result = result / value
        }
        return result
    }
}   //숫자 여러개 가능 하지만 순서 정해져있음

class Calculator3(val initialValue: Int) {
    fun plus(number: Int): Calculator3 {
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number: Int): Calculator3 {
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun multiply(number: Int): Calculator3 {
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun divide(number: Int): Calculator3 {
        val result = this.initialValue / number
        return Calculator3(result)
    }
}

