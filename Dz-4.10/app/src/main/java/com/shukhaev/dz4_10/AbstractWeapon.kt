package com.shukhaev.dz4_10

abstract class AbstractWeapon constructor(
    private val maxAmmo: Int,
    private val fireType: FireType

) {
    private val currentListAmmo: MutableList<Ammo> = mutableListOf()
    val isArmed get() = currentListAmmo.isNotEmpty()

    abstract fun createAmmo(): Ammo
    fun reload() {
        for (i in 1..maxAmmo) {
            currentListAmmo.add(createAmmo())
        }
    }

    fun getAmmoToShoot() {
        if (currentListAmmo.isEmpty()) {
            reload()
        } else {
//            if (fireType is FireType.SingleShoot) currentListAmmo.removeAt(currentListAmmo.size - 1)
//            else for (i in currentListAmmo.size..currentListAmmo.size - 2) currentListAmmo.removeAt(i)
            when(fireType){
                FireType.SingleShoot -> currentListAmmo.removeAt(currentListAmmo.size - 1)
                FireType.RapidFire -> for (i in currentListAmmo.size-1..currentListAmmo.size - 3) currentListAmmo.removeAt(i)
            }
        }
    }
}