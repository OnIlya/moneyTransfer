package ru.netology

fun main() {
    var moneyTransfer = 1000
    val kopecks = 100
    val amount = moneyTransfer * kopecks
    val minTransferKopecks = 35 * kopecks
    val commission = ((amount * 0.75) / 100)
    val commissionToCard = if (commission > minTransferKopecks) commission else minTransferKopecks
    val resultCommission = commissionToCard.toInt()

    println("$resultCommission коп")

}