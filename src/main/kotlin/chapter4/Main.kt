package chapter4

fun main() {
    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(1000L)

    equalsKt(money1, money2)
    identityKt(money1, money2)

    val kotlinMoney1 = KotlinMoney(100)
    val kotlinMoney2 = KotlinMoney(200)

    print(kotlinMoney1 + kotlinMoney2)
}

fun equalsKt(money1: JavaMoney, money2: JavaMoney) {

    println(money1 == money2)

}

fun identityKt(money1: JavaMoney, money2: JavaMoney) {

    println(money1 === money2)

}
