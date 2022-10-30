package chapter8

fun repeat0(str: String, num: Int, useNewLine: Boolean) {
    for (i in 1..num) {
        if (useNewLine) {
            print(str)
        } else {
            print(str)
        }
    }
}


fun main() {
    repeat(str = "hi", num = 3, useNewLine = true)
}

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            print(str)
        } else {
            print(str)
        }
    }
}

fun main2() {
    printAll("A", "A2", "A3")
    printAll()
}

fun printAll(vararg strings: String) {
    for(str in strings) {
        print(str)
    }
}
