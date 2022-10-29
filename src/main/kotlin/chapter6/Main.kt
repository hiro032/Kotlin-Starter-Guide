package chapter6

fun main() {
    val numbers = listOf(1, 2, 3)

    for (number in numbers) {
        print(number)
    }

}

fun upto() {
    for (i in 1..5) {
        println(i)
    }
}

fun down() {
    for(i in 5 downTo 1 step 3) {
        print(i)
    }
}
