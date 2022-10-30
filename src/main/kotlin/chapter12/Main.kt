package chapter12

import java.util.Objects

fun main() {
    Person.newBaby("hi")
    Person.log()

    Person.Factory.newBaby("hi")
    Person.Factory.log()

    Singleton.a

    moveSomething(object : Movable{
        override fun move() {
            print("movable")
        }
    })
}

class Person(
    var name: String,
    var age: Int
) {
    companion object Factory: Log{
        private const val MIN_AGE = 1

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
        }
    }
}

object Singleton {
    const val a: Int = 0
}

fun moveSomething(movable: Movable) {

}
