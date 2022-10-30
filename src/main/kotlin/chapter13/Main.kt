package chapter13

class House(
    val address: String,
    val livingRoom: LivingRoom
) {
    class LivingRoom(
        private val area: Double
    )
}


class House2(
    val address: String,
) {

    var livingRoom = this.LivingRoom(10.0)

    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@House2.address
    }
}
