package com.example.standartprogramlama

import java.util.Scanner

fun main(){
    val girdi = Scanner(System.`in`)

    println("Lütfen İsminizi Giriniz")

    val isim = girdi.next()

    println("Tekrar Sayısını giriniz")
    val tekrar = girdi.nextInt()

    for (i in 1..tekrar ) {
        println("$i. $isim")
    }
}