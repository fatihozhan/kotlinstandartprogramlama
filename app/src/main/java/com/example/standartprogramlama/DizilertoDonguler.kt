package com.example.standartprogramlama

fun main(){
    val meyveler = arrayOf<String>("Çilek", "Muz", "Kivi", "Kiraz")

    for (meyve in meyveler){
        println("Sonuc : $meyve")
    }
    for ((index , meyve) in meyveler.withIndex()){
        println("Sonuç $index : $meyve")
    }

    meyveler.map { meyve -> println(meyve) }
}