package com.shukhaev.dz4_10

import com.shukhaev.dz4_10.Weapons.sniperRifle

class WarriorSenior : AbstractWarrior(300, 30, 80, sniperRifle) {
    override val isKilled: Boolean = false

}