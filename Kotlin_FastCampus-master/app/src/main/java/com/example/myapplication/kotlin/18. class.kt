package com.example.myapplication.kotlin

import android.speech.tts.TextToSpeech

// OOP -> object oriented programing 객체지향 프로그래밍
// 객체 = 이름이 있는 모든 것

//절차지향 프로그래밍 -> 코드를 위에서부터 아래로 실행하면 문제 없음
//객체지향 프로그래밍 -> 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결

//객체를 만드는 방법 -> 설명서 필요


fun main(array: Array<String>) {
    //클래스를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스(객체)
    Car("V8 engine", "big")
    val bigcar = Car("V8 engine", "big")

    //우리가 만든 클래스는 자료형이 된다
    val bigCar: Car = Car("V8 engine", "big")

    val superCar: Supercar = Supercar("good engine", "big", "white")

    //인스턴스가 가지고있는 기능을 사용하는 방법
    val runableCar: RunableCar = RunableCar("simple engine", "small body")
    runableCar.ride()
    runableCar.navi(destination = "부산")
    runableCar.drive()

    //인스턴스의 멤버 변수에 접근 하는 방법
    val runableCar2 : RunableCar2 = RunableCar2("nice engine", "long body")
    println(runableCar2.body)
    println(runableCar2.engine)
}

//클래스(설명서) 만드는 방법(1)
class Car(var engine: String, var body: String) {
}

//클래스를 만드는 방법(2)
class Supercar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

//클래스 만드는 방법(3) -> 1번 방법의 확장
class Car1 constructor(var engine: String, var body: String) {
    var door: String = ""

    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

//클래스 만드는 방법(4) -> 2번 방법의 확장     엔진과 바디는 필수요소이고, 도어는 필수 아님
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunableCar(engine: String, body: String) { //생성자

    fun ride() {
        println("탑승하였습니다.")
    }

    fun drive() {
        println("달립니다")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다")
    }
}

class RunableCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {             //생성자
        this.engine = engine
        this.body = body
    }

    init{                                                   //실제 인스턴스화 될 때 가장 먼저 호출
        println("RunableCar2가 만들어졌습니다.")              //초기셋팅을 할때 유용
    }

    fun ride() {
        println("탑승하였습니다.")
    }
    fun drive() {
        println("달립니다")
    }
    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다")
    }
}

//오버로딩 -> 이름이 같지만 받는 인수의 수가 다른 함수
