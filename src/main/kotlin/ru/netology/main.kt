package ru.netology

fun main() {
    var moneyTransfer = 200000
    val amount = moneyTransfer * 100
    val commission = if (((amount * 0.75) / 100) > 35 * 100) ((amount * 0.75) / 100) else 35 * 100
    val resultCommission = commission.toInt()

    println("$resultCommission коп")

}