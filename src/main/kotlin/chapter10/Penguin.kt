package chapter10

class Penguin(
    species: String,
    swimAbility: Int
): Animal(species, 2), Flyable, Swimable {

    private val wingCount: Int = 2

    override fun move() {
        print("penguin move")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Flyable>.act()
        super<Swimable>.act()
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

    override val swimAbility: Int
        get() = this.swimAbility
}
