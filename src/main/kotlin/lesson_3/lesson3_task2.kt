package org.example.lesson_3

fun main(){
    //До свадьбы
    val nameWife = "Татьяна";
    var surnameWife = "Андреева";
    val patronymicWife = "Сергеевна";
    var ageWife = 20;
    println("Данные до свадьбы: " +
            "\n Возраст: $ageWife " +
            "\n Имя: $nameWife " +
            "\n Фамилия: $surnameWife " +
            "\n Отчество: $patronymicWife");
    //После свадьбы
    ageWife = 22;
    surnameWife = "Сидорова";
    println("Данные после свадьбы: " +
            "\n Возраст: $ageWife " +
            "\n Имя: $nameWife " +
            "\n Фамилия: $surnameWife " +
            "\n Отчество: $patronymicWife");
}