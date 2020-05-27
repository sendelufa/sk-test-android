package com.shukhaev.dz4_10

import com.shukhaev.dz4_10.Weapons.automaticGun

class WarriorMiddle : AbstractWarrior(200, 20, 50, automaticGun) {
    override val isKilled: Boolean = false

}