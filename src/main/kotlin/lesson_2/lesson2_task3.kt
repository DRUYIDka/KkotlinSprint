package org.example.lesson_2

fun main(){
    val hoursCheckOut = 9
    val minuteCheckOut = 39
    val minutesOnTheWay = 457
    val hoursOnTheWay = 457/60
    val minutesForHours = 457%60
    val arrivalTimeHours = hoursOnTheWay + hoursCheckOut + ((minuteCheckOut + minutesForHours) / 60)
    val arrivalTimeMinutes = (minuteCheckOut + minutesForHours)%60
    println("Время прибытия поезда: $arrivalTimeHours:$arrivalTimeMinutes")
}