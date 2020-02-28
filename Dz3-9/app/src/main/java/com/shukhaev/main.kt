package com.shukhaev

fun main() {
    var array: ArrayList<Int> = arrayListOf<Int>()
    println("Enter count of numbers")
    val count = readLine()?.toIntOrNull()
    if (count != null) {
        array = getArray(count)
    } else return
    println("Count of positive numbers is " + getCountPositive(array))

    println("Even numbers is " + array.filter { it % 2 == 0 })

    println("Sum of all numbers is " + array.sum())

    //Вывод количества уникальных чисел через SET
    println("Count of unique numbers is " + array.toSet().size)

    //Создаем MAP из чисел и НОД
    val mapOfNumbersAndGCD = mutableMapOf<Int, Int>()
    array.forEach {
        val temp = greatestCommonDivisor(it, array.sum())
        mapOfNumbersAndGCD.put(it, temp)
    }

    mapOfNumbersAndGCD.forEach { (key, value) -> println("Число <$key>, сумма <${array.sum()}>, НОД <$value>") }
}

fun getArray(count: Int): ArrayList<Int> {
    val array = arrayListOf<Int>()
    var number: Int?
    println("Enter numbers")
    do {
        number = readLine()?.toIntOrNull()
        if (number != null) {
            array.add(number)
        }
    } while (array.size < count)
    return array
}

fun getCountPositive(array: ArrayList<Int>): Int {
    var countPositive = 0
    array.forEach { if (it > 0) countPositive++ }
    return countPositive
}

tailrec fun greatestCommonDivisor(a: Int, b: Int): Int {
    return if (b == 0) a else greatestCommonDivisor(b, a % b)
}
