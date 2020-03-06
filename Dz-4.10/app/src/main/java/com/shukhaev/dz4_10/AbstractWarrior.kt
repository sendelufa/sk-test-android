package com.shukhaev.dz4_10

abstract class AbstractWarrior(
    maxHealth: Int,
    override val chanceToDodge: Int,
    val accuracy: Int,
    val weapon: AbstractWeapon
) : Warrior {
    var currentHealth = maxHealth
    override fun toAttack(warrior: Warrior) {

    }

    override fun beingHit(damage: Int) {
        currentHealth -= damage
    }
}