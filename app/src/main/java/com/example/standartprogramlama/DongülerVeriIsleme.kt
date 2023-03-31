package com.example.standartprogramlama

import java.util.Scanner

fun main(){
    val girdi = Scanner(System.`in`)

    println("İşlenecek Veri Miktarını Giriniz")

    var veri = girdi.nextInt()
    while (veri > 0){
        println("$veri ")
        veri = veri - 1
    }
}