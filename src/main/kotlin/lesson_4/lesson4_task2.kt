package org.example.lesson_4

fun main(){
    var weightCargo = 20
    var volumeCargo = 80
    val weightStart = 35
    val weightFinish = 100
    val volumeMax = 100

    println("Груз весом $weightCargo и объёмом $volumeCargo " +
            "соответствует категории 'Average': ${weightStart < weightCargo && 
                    weightCargo <= weightFinish && volumeCargo < volumeMax}")

    weightCargo = 50
    volumeCargo = 100

    println("Груз весом $weightCargo и объёмом $volumeCargo " +
            "соответствует категории 'Average': ${weightStart < weightCargo &&
                    weightCargo <= weightFinish && volumeCargo < volumeMax}")
}