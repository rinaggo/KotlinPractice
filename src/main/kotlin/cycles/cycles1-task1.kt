package cycles

fun main(){

    print("Введите количество дней, которое вы будете копить деньги: ")
    val countDays = readln().toInt()
    var countMoney = 0

    for (i in 0..countDays){
        countMoney += countDays
    }

    println(countMoney)
}