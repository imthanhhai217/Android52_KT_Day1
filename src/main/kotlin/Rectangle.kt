class Rectangle(var a: Double, var b: Double):Shape("Rectangle") {

    constructor(a: Int) : this(a.toDouble(), a.toDouble())

    init {
        println(" A : $a | B : $b")
    }

    override fun area(): Double = a * b

    override fun perimeter():Double = (a + b) * 2

    fun checkSquare() = a==b
}