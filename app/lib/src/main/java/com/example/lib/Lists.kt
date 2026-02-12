package com.example.lib

fun main () {
    val numbers = listOf(1,5,8,7,4,1,6,3,11,21,32)

    var maxNumber = numbers[0]

    for (number in numbers) {
        if (number > maxNumber) {
            maxNumber = number
        }
    }
    println("el numero mas grande es $maxNumber")
}