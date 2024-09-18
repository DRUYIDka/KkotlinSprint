package org.example.lesson_2

fun main(){
    val cristalNoBuff = 7
    val ironNoBuff = 11
    val buffOnCristal: Int = (cristalNoBuff * BUFF_ON_MATERIAL)/100
    val buffOnIron: Int = (ironNoBuff * BUFF_ON_MATERIAL)/100
    println ("Бафф будет давать сверху: buffOnCristal")
    println("Для кристаллической руды: $buffOnCristal")
    println("Для железной руды: $buffOnIron")
            
}
const val BUFF_ON_MATERIAL = 20