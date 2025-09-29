package cycles

fun main() {

    print("Введите количество итераций: ")
    val countIteration = readln().toInt()
    var result = 1

    for (i in 1.. countIteration){
        result *= i
    }

    print(result)
}