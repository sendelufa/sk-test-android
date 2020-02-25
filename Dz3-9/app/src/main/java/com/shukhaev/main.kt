package com.shukhaev

fun main() {
    var array: ArrayList<Int> = arrayListOf<Int>()
    println("Enter count of numbers")
    var countString = readLine()
    var count = countString?.toIntOrNull()
    if (count != null) {
        array = getArray(count)
    } else return
    println("Count of positive numbers is " + getCountPositive(array))

    println("Even numbers is " + array.filter { it % 2 == 0 })

    println("Sum of all numbers is " + array.sum())

        //Вывод количества уникальных чисел через SET
    val set = mutableSetOf<Int>()
    for (i in array) {
        set.add(i)
    }
    println("Count of unique numbers is " + set.size)

        //Создаем MAP из чисел и НОД
    var map = mutableMapOf<Int, Int>()
    for (i in array) {
        val temp = gcd(i, array.sum())
        map.put(i, temp)
    }

    for (key in map.keys) {
        //в формате: Число <>, сумма <>, НОД <>
        println("Число <$key>, сумма <${array.sum()}>, НОД <${map[key]}>")
    }
}

fun getArray(count: Int): ArrayList<Int> {
    var array = arrayListOf<Int>()
    var number: Int?
    println("Enter numbers")
    for (i in 1..count) {
        number = readLine()?.toIntOrNull()
        if (number != null) {
            array.add(number)
        }
    }
    return array
}

fun getCountPositive(array: ArrayList<Int>): Int {
    var countPositive = 0
    for (i in array) {
        if (i > 0) countPositive++
    }
    return countPositive
}

tailrec fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}
