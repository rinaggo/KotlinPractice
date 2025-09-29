package cycles

fun main(){

    for (i in 1..9){
        for (j in 1..9){
            print(String.format("%2d ", i * j))
        }
        println()
    }
}