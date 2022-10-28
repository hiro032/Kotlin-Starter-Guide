package chapter3

import chapter2.Person

fun main() {
    val person = Person("hiro", 17)//name, age
    val log = "Person의 이름은 ${person.name}이며 나이는 ${person.age}이다."
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as chapter2.Person
        print(person.name)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    if (obj is Person) {
        val person = obj as? Person
        print(person?.name)
    }
}

