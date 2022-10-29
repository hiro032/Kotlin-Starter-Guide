package chapter5

fun validateScoreIsNotNegative(score: Int) {
    if(score < 0) {
        throw IllegalArgumentException()
    }
}

fun getPassOrFail(score: Int): String {
    val result =  if(score > 50) {
        return "P"
    }
    else return "F"

    return result
}

fun getGradeWithSwitch(score: Int): String {
    val result = when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }

    return result
}

fun getGradeWithSwitchIn(score: Int): String {
    val result = when (score / 10) {
        in 10..9 -> "A"
        in 8..7 -> "B"
        in 6..5 -> "C"
        else -> "D"
    }

    return result
}
