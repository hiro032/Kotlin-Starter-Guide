package chapter4

data class KotlinMoney(
    val amount: Long
) {
    operator fun plus(other: KotlinMoney):KotlinMoney {
        return KotlinMoney(amount + other.amount)
    }
}
