package com.example.myapplication.kotlin

// 계좌 생성 기능(이름, 생년월일, 현재 잔고)
// 잔고확인
// 입금, 출금

fun main(array: Array<String>) {
    val account1: Account1 = Account1("최우석", 19980702, 20000)
    println(account1.checkmoney())
    account1.deposit(10000)
    println(account1.checkmoney())
    account1.withdraw(50000)
    println(account1.checkmoney())
    account1.withdraw(10000)
    println(account1.checkmoney())
    println()
    
    val account2: Account2 = Account2("최우석", 19980702)         //클래스를 만들때 초기값 설정
    println(account1.checkmoney())

}

class Account1 {

    var name: String
    var birth: Int
    var money: Int

    constructor(name: String, birth: Int, money: Int){
        this.name=name
        this.birth=birth
        if(money>=0){
            this.money=money
        }
        else {
            this.money = 0
        }
    }

    fun checkmoney(): Int {
        return money
    }

    fun deposit(price: Int) {
        money = money + price
        println("$price 원 입금 성공")
    }

    fun withdraw(price2: Int) {
        if (money >= price2) {
            money = money - price2
            println("$price2 원 출금 성공")
        } else {
            println("잔고 부족 출금 실패")
        }
    }
}

class Account2 (var name:String, var birth: Int, var money: Int = 10000){      //money 초기값 설정

    fun checkmoney(): Int {
        return money
    }

    fun deposit(price: Int) {
        money = money + price
        println("$price 원 입금 성공")
    }

    fun withdraw(price2: Int) {
        if (money >= price2) {
            money = money - price2
            println("$price2 원 출금 성공")
        } else {
            println("잔고 부족 출금 실패")
        }
    }
}