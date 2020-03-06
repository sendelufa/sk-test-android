package com.shukhaev.dz4_10

import kotlin.random.Random

enum class Ammo(
    private val damage: Int,
    private val criticalDamageChance: Int,
    private val ratioCriticalDamage: Int
) {

    SIMPLE_BULLET(3, 5, 2),
    BIG_BULLET(5, 10, 3),
    NUCLEAR_BULLET(8, 15, 4);

    fun getCurrentDamage(ammo: Ammo): Int {
        return if (Random.nextInt(until = 100) <= ammo.criticalDamageChance) {
            ammo.damage * ammo.ratioCriticalDamage
        } else ammo.damage
    }
}