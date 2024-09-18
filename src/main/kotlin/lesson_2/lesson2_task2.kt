package org.example.lesson_2

fun main(){
    var saleryConstEmployee = 30000;
    var constEmployee = 50;
    var saleryJunior = 20000;
    var junior = 30;
    val generalExpensesOfConst = saleryConstEmployee * constEmployee;
    println("Расходы на выплату зарплаты постоянных сторудников: $generalExpensesOfConst");
    val generalExpenses = (saleryJunior + saleryConstEmployee)*(constEmployee + junior);
    println("Расходы на зарплату после прихода стажёров: $generalExpenses");
    val averageEmployee = (saleryJunior + saleryConstEmployee) / (constEmployee + junior);
    println("Средняя зарплата после прихода стажёров: $averageEmployee");
}