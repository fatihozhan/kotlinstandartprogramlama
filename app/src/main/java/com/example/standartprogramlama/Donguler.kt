package com.example.standartprogramlama

fun main() {
    for (i in 3..5) {
        println(i)
    }
    //10 ile 20 arasında 5 er artsın
    var baslangic = 10
    var bitis = 20
    var artis = 5
    for (a in baslangic..bitis step artis) {
        println("a : $a")
    }

    for (b in 20 downTo 10 step 2) {
        println("b : $b")
    }

    for (c in 1..5) {
        println("c : $c")
    }

    //5 dahil olmaz
    for (c in 1 until 5) {
        println("c : $c")
    }

    var sayac = 1
    while (sayac < 4) {
        println("sayac : $sayac")
        sayac += 1
    }
}