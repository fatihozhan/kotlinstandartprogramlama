package com.example.standartprogramlama

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)

    val isimler = Array<String>(5) {""} // ["","","","",""]
    for (i in 0 until isimler.count()){
        println("${i + 1}. İsmi Giriniz")
        val isim = girdi.next()
        isimler[i] = isim
    }


    println(isimler.contentToString())

    for ((index, isim) in isimler.withIndex()){
        println("${index + 1}. isim : $isim")
    }
}