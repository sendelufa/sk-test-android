package com.shukhaev.dz4_10

sealed class FireType(val type: String){
    object SingleShoot: FireType("SingleShoot")
    object RapidFire: FireType("RapidFire")

}