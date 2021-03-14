package com.example.myapplication.kotlin

//generic의 목적 : 타입을 체크하는 기능
//generic은 만들기 어렵고, 만들일 없이 때문에 사용하는 방법만 숙지

fun main(args: Array<String>) {

    val list1 = listOf(1, 2, 3, "가")
    val b: String = list1[2].toString()      //형변환

    //제너릭을 사용하는 경우
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2]                    //String이란 것을 보장받는다


    //제너릭을 사용하지 않은경우
    val list5 = listOf(1, 2, 3, "가")            //-> any타입
    //부모 : Any, 자식 : String
}