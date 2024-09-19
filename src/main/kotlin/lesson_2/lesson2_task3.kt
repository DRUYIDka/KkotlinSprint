package org.example.lesson_2

fun main(){
    val hoursCheckOut = 9
    val minuteCheckOut = 39
    val minutesOnTheWay = 457
    val hoursOnTheWay = minutesOnTheWay / STANDART_TIME
    val minutesForHours = minutesOnTheWay % STANDART_TIME
    val arrivalTimeHours = hoursOnTheWay + hoursCheckOut + ((minuteCheckOut + minutesForHours) / STANDART_TIME)
    val arrivalTimeMinutes = (minuteCheckOut + minutesForHours) % STANDART_TIME
    println("Время прибытия поезда: $arrivalTimeHours:$arrivalTimeMinutes")
}
const val STANDART_TIME = 60