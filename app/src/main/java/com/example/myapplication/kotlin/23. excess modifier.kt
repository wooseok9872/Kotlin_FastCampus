package com.example.myapplication.kotlin

fun main(array: Array<String>) {
    val testAccess: TestAccess = TestAccess("아무개")
    testAccess.test()
    // println(testAccess.name) 클래스 밖에서 접근 불가
}

class TestAccess {
    private var name: String = "홍길동"       // 클래스 외부에서는 접근 불가하게 설정

    constructor(name: String) {
        this.name = name
    }

    fun test() {
        println("테스트")
    }
}