package com.shukhaev.dz4_10

sealed class FireType(val type: String, val countShoots: Int){
    object SingleShoot: FireType("SingleShoot",1)
    object RapidFire: FireType("RapidFire",3)
}