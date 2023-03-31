package com.example.standartprogramlama

fun main() {
    for (i in 1..5) {
        if (i == 4) {
            break
        }
        println("Döngü : $i")
    }
    for (i in 1..5) {
        if (i == 3) {
            continue
        }
        println("Döngü : $i")
    }
}