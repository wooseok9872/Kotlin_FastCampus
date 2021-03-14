package com.example.myapplication.kotlin

fun main(array: Array<String>) {
    val night = Night(20, 4)
    val monster = Monster(15, 5)

    night.attack(monster)
    monster.attack(night)

    /*night.hp = 100
    println(night.hp)*/     //hp나 power에 접근하지 못하게 private으로 막음
}

class Night(private var hp: Int, private var power: Int) {
    fun attack(monster: Monster) {
        monster.defense(power)
    }

    fun defense(damage: Int) {
        hp = hp - damage
        if (hp > 0) {
            heal()
            println("기사의 현재 체력은 $hp 입니다.")
        } else println("기사가 사망했습니다.")
    }

    private fun heal() {                            //아무때나 회복하지 않게 하기 위해 private 사용
        hp += 3 //공격을 당했을때 죽지 않았다면 회복
    }
}

class Monster(private var hp: Int, private var power: Int) {

    fun attack(night: Night) {
        night.defense(power)
    }

    fun defense(damage: Int) {
        hp = hp - damage
        if (hp > 0) println("몬스터의 현재 체력은 $hp 입니다.")
        else println("몬스터가 사망했습니다.")

    }
}