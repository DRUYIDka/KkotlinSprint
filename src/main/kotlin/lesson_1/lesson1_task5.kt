package org.example.lesson_1
fun main(){
    val secondsOfSpace: Short = 6480;
    val minuteOfSpace = secondsOfSpace / 60;
    val hoursOfSpace = minuteOfSpace / 60;
    val remainsOfSeconds = secondsOfSpace % 60;
    val remainsOfMinute = minuteOfSpace % 60;
    print("0$hoursOfSpace:$remainsOfMinute:0$remainsOfSeconds")
}