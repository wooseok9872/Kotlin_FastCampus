package com.example.myapplication.kotlin

fun main(args: Array<String>) {
    val monster = SuperMonster(100, 10)
    val night = SuperNight(130, 8)
    monster.attack(night)
    monster.bite(night)

    //자식 클래스는 부모 클래스의 타입이다.
}

open class Character(var hp: Int, val power: Int) {
    open fun attack(character: Character, power: Int = this.power) {
        character.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("${javaClass.simpleName}의 남은 체력 $hp 입니다")  //클래스의 이름을 출력 가능
        else println("사망했습니다")
    }
}

// 자식 클래스가 인스턴스화 되기 위해서 부모 클래스 선행돼서 인스턴스화 되어야 한다.
class SuperMonster(hp: Int, power: Int) : Character(hp, power) {
    fun bite(character: Character) {
        super.attack(character, power + 2)
    }
}

class SuperNight(hp: Int, power: Int) : Character(hp, power){
    val defensePower=2
    override fun defense(damage: Int) {
        super.defense(damage-defensePower)
    }
}