package com.example.myapplication.kotlin

fun main(array: Array<String>) {

    val tv = TV(listOf<String>("K", "M", "S"))

    tv.switch()
    tv.channelup()
    println(tv.CheckCurrentChannel())
    tv.channelup()
    println(tv.CheckCurrentChannel())
    tv.channelup()
    println(tv.CheckCurrentChannel())
    tv.channelup()
    println(tv.CheckCurrentChannel())

}

class TV(var channels: List<String>) {           // 입력 변수를 list로 받음

    var OnorOff: Boolean = false                //True = on, False = off
    var currentchannelnumber = 0
        set(value) {                            //변수가 할당될 때 설정해주는 방법 (변수가 호출될 때는 get
            field = value                       //list에서 범위를 넘어갔을 때 다시 처음으로 돌아오게 하는 방법
            if (field > 2) {
                field = 0
            }
            if (field < 0) {
                field = 2
            }
        }

    fun switch() {                               //TV on/off 기능 함수
        OnorOff = !OnorOff
        if (OnorOff == true) println("TV on")
        else println("TV off")
    }

    fun CheckCurrentChannel(): String {
        return channels[currentchannelnumber]
    }

    fun channelup() {
        currentchannelnumber = currentchannelnumber + 1
    }

    fun channeldown() {
        currentchannelnumber = currentchannelnumber - 1
    }
}