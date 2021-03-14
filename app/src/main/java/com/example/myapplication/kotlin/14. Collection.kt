package com.example.myapplication.kotlin

fun main(args: Array<String>) {
    // Immutable collection(변경 x)
    //List -> 중복 허용 o
    val numberList = listOf<Int>(1, 2, 3, 3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])

    println()

    //Set(집합) -> 중복 허용x, 순서가 없다
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)
    numberSet.forEach{it;Int
        println(it)
    }

    println()

    //Map -> key, value 방식으로 관리
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap.get("one"))

    println()

    //Mutable Collection(변경 O)
    val mNumberList= mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println(mNumberList)

    val mNumberSet= mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)

    val mNumberMap= mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two",2)
    println(numberMap)

}