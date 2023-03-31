package com.example.standartprogramlama

import java.util.Scanner

fun main() {
    val dersler = Array<String>(5) { "" }
    val notlar = Array<Int>(5) { 0 }
    val girdi = Scanner(System.`in`)

    for (i in 0 until dersler.count()) {
        println("${i + 1}.Dersi Giriniz")
        dersler[i] = girdi.next()
        println("${i + 1}.Dersin Notunu Giriniz")
        notlar[i] = girdi.nextInt()
    }
    var toplam = 0
    for (i in 0 until dersler.count()) {
        println("${dersler[i]} : ${notlar[i]}")
        toplam = toplam + notlar[i]
    }
    val ortalama = toplam / notlar.count()
    println("Ortalama : $ortalama")


    if (ortalama > 50   ) {
        println("Geçti")
    }else {
        println("Kaldı")
    }

}