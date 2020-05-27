package com.shukhaev.dz4_10

interface Warrior {

    val isKilled:Boolean    //состояние бойца
    val chanceToDodge:Int   // шанс увернуться
    fun toAttack (warrior: Warrior)     //атака
    fun beingHit(damage:Int)    //получаемый урон
}