package chapter14

data class PersonDto(
    val name: String,
    val age: Int
)

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
}

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante: HyundaiCar("아반떼", 1000)
class Sonata: HyundaiCar("소나타", 2000)
class Grandeur: HyundaiCar("그랜저", 3000)
