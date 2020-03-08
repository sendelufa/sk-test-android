package com.shukhaev.dz4_10

abstract class AbstractWeapon constructor(
    private val maxAmmo: Int,
    private val fireType: FireType

) {
    var currentListAmmo: MutableList<Ammo> = mutableListOf()
    val isArmed: Boolean = if (currentListAmmo.isEmpty()) false else true

    abstract fun createAmmo(): Ammo
    fun reload() {
        for (i in 1..maxAmmo) {
            currentListAmmo.add(createAmmo())
        }
    }

    fun getAmmoToShoot() {
        if (fireType is FireType.SingleShoot) currentListAmmo.removeAt(currentListAmmo.size - 1)
        else for (i in currentListAmmo.size..currentListAmmo.size - 2) currentListAmmo.removeAt(i)
    }

}