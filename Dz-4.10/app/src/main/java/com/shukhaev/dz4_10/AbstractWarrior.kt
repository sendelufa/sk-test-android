package com.shukhaev.dz4_10

abstract class AbstractWarrior(
    private val maxHealth: Int,
    override val chanceToDodge: Int,
    private val accuracy: Int,
    private val weapon: AbstractWeapon
) : Warrior {
    private var currentHealth = maxHealth
    override fun toAttack(warrior: Warrior) {
        if (!weapon.isArmed) {
            weapon.reload()
        }else {
            weapon.getAmmoToShoot()
        }
    }

    override fun beingHit(damage: Int) {
        currentHealth -= damage
    }
}