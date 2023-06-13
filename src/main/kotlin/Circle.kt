import kotlin.random.Random

class Circle(val radius: Double):Shape("Circle") {
    init {
        println("Circle radius = $radius")
    }

    companion object {
        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }

    override fun area() = radius * radius * Math.PI

    override fun perimeter() = 2 * Math.PI * radius
}