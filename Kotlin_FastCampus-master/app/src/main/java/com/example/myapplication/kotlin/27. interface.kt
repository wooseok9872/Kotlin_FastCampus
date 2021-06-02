package com.example.myapplication.kotlin

//인터페이스는 약속 - 인터페이스는 생성자가 없다, 설명서가 아님
//인터페이스는 지침서, 이것을 구현하고 싶다면 반드시 아래 기능을 구현하라
//인터페이스도 구현이 있는 함수를 만들 수 있다. 구현이 있느 ㄴ함수는 클래스에서 함수를 구현할 필요 없다.

fun main(args: Array<String>){
    val student_: Student_ = Student_()
    student_.eat()
    student_.study()
}

interface Person_ {
    fun eat(){
        println("먹는다")
    }
    fun sleep(){
        println("잔다")
    }
    abstract fun study()                        //abstract는 반드시 구현해야 하는 함수
}

class Student_ : Person_ {
    override fun study() {
        println("학생 공부")
    }
}

class Teacher_: Person_{
    override fun study() {
        println("선생 공부")
    }
}
