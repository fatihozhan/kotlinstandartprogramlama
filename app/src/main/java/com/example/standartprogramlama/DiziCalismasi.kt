package com.example.standartprogramlama

fun main(){

    //Tanımlama
    val dizi1 = Array<Int>(5) {0} // [0,0,0,0,0]

    val dizi2 = arrayOf(1,10,2)
    val dizi3 = arrayOf<Int>(1,10,2)
    val dizi4 = arrayOf<String>("Çilek", "Ahmet", "Fatih")
    val dizi5 = arrayOf("Çilek", 3, "Fatih")

    val meyveler = arrayOf<String>("Çilek", "Muz", "Elma", "Kivi", "Kiraz")

    //Verilere Erişim

    val str1 = meyveler[2]
    val str2 = meyveler.get(3)
    println(str1)
    println(str2)

    meyveler[1] = "Yeni Muz"
    meyveler.set(2,  "Yeni Elma")
    println(meyveler.contentToString())

    //Array İşlemleri

    println(meyveler.isEmpty())
    println(meyveler.count())
    println(meyveler.first())
    println(meyveler.last())
    println(meyveler.indexOf("Kivi"))
    println(meyveler.contains("Muz"))
    println(meyveler.contains("Yeni Muz"))
    println(meyveler.max())
    println(meyveler.min())
    println(meyveler.sort())
    println(meyveler.contentToString())

    println(meyveler.reverse())
    println(meyveler.contentToString())


}