package chapter9


fun main() {
    val person = Person("hiro", 20)

    person.age = 10
    print(person.name)
}

class Person (
    name: String,
    var age: Int
) {
    val name: String = name
        get() = field.uppercase()

    init {
        if(age < 0) {
            throw IllegalArgumentException()
        }
    }

    fun isAdultByMethod(): Boolean {
        return this.age >= 20
    }

    val isAdultByCustomGetter: Boolean
        get() = this.age >= 20;


}
