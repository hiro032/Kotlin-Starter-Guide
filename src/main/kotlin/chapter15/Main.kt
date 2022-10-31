package chapter15

fun main() {

    val array = arrayOf(100, 200)

    for(i in array.indices) {
        print("${i} ${array[i]}")
    }

    for((idx, value) in array.withIndex()) {
        print("${idx} ${value}")
    }

    val numbers = listOf(100, 200, 300)
    val mutableNumbers = mutableListOf(100, 200, 300)

    val number = numbers[0]

    for(number in numbers) {
        print(number)
    }

    for((idx, value) in numbers.withIndex()) {
        print("$idx $value")
    }

}
