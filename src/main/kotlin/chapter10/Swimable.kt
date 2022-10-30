package chapter10

interface Swimable {

    val swimAbility: Int
        get() = 0

    fun act() {
        print(" swim ")
    }
}
