package org.example.lesson_3

fun main(){
    var startPoint = "E2"
    var finishPoint = "E4"
    var strokeNumber = 2
    val generalLine = "Откуда: $startPoint Куда: $finishPoint Номер хода: $strokeNumber"

    println("Ход чёрных $generalLine")

    startPoint = "D2"
    finishPoint = "D3"
    strokeNumber++

    println("Ход белых: Откуда: $startPoint Куда: $finishPoint Номер хода: $strokeNumber")

}