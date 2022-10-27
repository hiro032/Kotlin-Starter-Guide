package chapter2

fun main() {
    val p = Person("hi")
    startsWithA1ByJava(p.name)

//    startsWithA4ByJava(p.name) -> compile error
}

fun startsWithA1ByJava(str: String?): Boolean {
    if(str == null) {
        throw IllegalArgumentException("str is null")
    }
    return str.startsWith("A")
}

fun startsWithA1ByKt(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("str is null")
}

fun startsWithA2ByJava(str: String?): Boolean? {
    if(str == null) {
        return null;
    }
    return str.startsWith("A")
}

fun startsWithA2ByKt(str: String?): Boolean? {
    return str?.startsWith("A")
        ?: null;
}

fun startsWithA3ByJava(str: String?): Boolean {
    if (str == null) {
        return false;
    }
    return str.startsWith("A");
}

fun startsWithA3ByKt(str: String?): Boolean {
    return str?.startsWith("A")
        ?: false
}

fun startsWithA4ByJava(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA4ByKt(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA5(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("str is null")
}

