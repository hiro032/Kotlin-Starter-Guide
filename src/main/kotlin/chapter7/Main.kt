package chapter7

import java.io.BufferedReader
import java.io.FileReader
import java.util.*

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw java.lang.IllegalArgumentException()
    }
}

fun readFile(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        print(reader.readLine())
    }
}
