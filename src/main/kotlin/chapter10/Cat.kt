package chapter10

class Cat(
    species: String
): Animal(species, 4) {

    override fun move() {
        print("kotlin cat move")
    }

}
