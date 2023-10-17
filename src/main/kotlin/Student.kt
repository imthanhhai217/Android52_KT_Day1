class Student(private val firstName: String, private val lastName: String) {

    init {
        println(" Student info : $firstName $lastName")
    }

    var age: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }


    fun checkIsChild(): Boolean = age < 18
}