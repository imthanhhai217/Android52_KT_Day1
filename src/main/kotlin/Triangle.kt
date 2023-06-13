import kotlin.math.sqrt

class Triangle(val a: Double, val b: Double, val c: Double) : Shape("Triangle") {
    override fun area(): Double =
        sqrt((perimeter() / 2) * ((perimeter() / 2) - a) * ((perimeter() / 2) - b) * ((perimeter() / 2) - c))

    override fun perimeter(): Double = a + b + c

}