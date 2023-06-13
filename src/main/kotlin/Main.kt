fun main(args: Array<String>) {
//    val b: Double = 6.0
//    val c: Float = 0f
//    var a:Boolean = true
//    println("${a::class.java}")
//    var result = b + c
//    println(result)

    // Viết chương trình tính thể tích hình cầu với radius = 5
    // Công thức : (4/3) * PI * radius^3
    //    volumeSphere()

    //Viết chương trình kiểm xem một chuỗi có thể đọc ngược và xuôi giống nhau k
    //Ví dụ Madam , ABABA,...
//    checkReversedString()

//    val array = arrayOf(1, 2, 3, 4)
//    val array2 = arrayOf("Hello", "i'm", "Hải", 1, 2, 3, 4)
//    array2[3] = 56
//    println(array2[3])
//
//    val arrayMutable = mutableListOf(1, 2, 3, 4, 5)
//    arrayMutable.add(6)
//    arrayMutable.removeAt(2)

//    var a = 0
//    while (a < 10) {
//        println(a)
//        a++
//    }

    // Viết chương trình cho phép nguười dùng nhập dữ liệu từ bàn phím với điều kiện number > 1
    // nếu không thì yêu cầu nhập lại
//    whileDemo()

//    forDemo()

    //Nhập từ phím một giá trị number in ra dãy fibonacci có số lượng phần tử = với giá trị vừa nhập
    // Ví dụ nhập vào 5 -> 0,1,1,2,3
    // nhập vào 8 -> 0,1,1,2,3,5,8,13
//    fibonacci()

    //Cho một mảng [1,2,3,4,5]
    // in mảng trên theo kiểu
    // 1,5,4,3,2
    // 1,5,2,4,3

//    alertArray()
//    println("Enter number ")
//    val input = readln().toInt()
//    if (input != null) {
//        println(input.isPrime())
//    }

//    val array = intArrayOf(5,6,7)
//    println(integers)
//    max(1,2,3,*array,4,5,6)

//    val integers = listOf(1, 3, 5, 8, 10, 2, 4, 9)
//    println("Max of list : ${integers.getMax()}")

//    println(integers.sorted())

    val rectangle = Rectangle(10.0, 5.0)
//    println("Area is ${rectangle.area()}")
//    println("Perimeter is ${rectangle.perimeter()}")
//
//
    val rectangle2 = Rectangle(2)
//    println("Area is ${rectangle2.area()}")
//
    val circle = Circle(5.0)
//    println("Area ${circle.area()} | Perimeter ${circle.perimeter()}")
//    println(circle.name)
//
    val randomCircle = Circle.randomCircle()
//    println("Area ${randomCircle.area()} | Perimeter ${randomCircle.perimeter()}")
//
    val triangle = Triangle(2.0, 3.0, 4.0)
//    println("Area ${triangle.area()} | Perimeter ${triangle.perimeter()}")

//    val name = "Hai"
//    println(name.concatString("Pham"))
//
//    val number = 5
//    println(number.concatString(10))
    val listShape = listOf(rectangle, rectangle2, circle, randomCircle, triangle)

    val a = 5
    val b = 10

    val sum: (Int, Int) -> Int = ::add
    println(sum(a, b))

    val c = 10
    val check: (Int) -> Boolean = ::isOdd
    println("Check ${check(c)}")

    val integers = (1..20).toList()
    println(integers.filter(::isOdd))
}

fun add(a: Int, b: Int) = a + b;

fun isOdd(x: Int) = x % 2 != 0


fun <T> T.concatString(append: T): String {
    return this.toString() + append.toString()
}

fun List<Int>.getMax(): Int {
    var max = this[0]
    for (i in this) {
        if (max < i) {
            max = i
        }

    }
    return max
}

fun Int.isPrime(): Boolean {
    for (i in 2 until this - 1) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}


fun forDemo() {
    val array2 = arrayOf("Hello", "i'm", "Hải", 1, 2, 3, 4)
    for (i in array2) {
        println(i)
    }
    for (i in array2.indices) {
        println(i)
    }

    for (i in 0..10 step 2) {
        println(i)
    }

    for (i in 0 until 10) {
        println(i)
    }

    for (i in 10 downTo 0) {
        println(i)
    }
}

fun alertArray() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var i = 0;
    var j = array.size - 1
    var toggle = true
    while (i <= j) {
        if (toggle) {
            println(array[i])
            i++
        } else {
            println(array[j])
            j--
        }
        toggle = !toggle
    }
}

fun fibonacci() {
    val list = mutableListOf(0, 1)
    var input = 0
    while (input <= 1) {
        print("Enter number value n > 1 : ")
        input = readln().toInt()
    }
    for (i in 2 until input) {
        list.add(list[i - 1] + list[i - 2])
    }
    println(list)


}

fun whileDemo() {
    var input = 0
    while (input <= 1) {
        print("Enter number value : ")
        input = readln().toInt()

    }
    println("Enter number is $input")
}

fun checkReversedString() {
    print("Enter string value : ")
    var input = readLine().toString()
    var revered = input.reversed()
    if (input == revered) {
        println(" This string is a palindrome")
    }
}

fun volumeSphere() {
    print("Enter radius value : ")
    var radius = readLine()?.toDouble()
    if (radius != null) {
        val volume = (4 / 3) * Math.PI * Math.pow(radius, 3.0)
        println("The volume of sphere with $radius : $volume")
    }
}
