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
            when(fireType){
                FireType.SingleShot -> currentListAmmo.removeAt(currentListAmmo.lastIndex)
                FireType.RapidFire -> for(i in currentListAmmo.lastIndex downTo currentListAmmo.size - fireType.countShots){
                        currentListAmmo.removeAt(i)
                }
            }
        }
    }
}