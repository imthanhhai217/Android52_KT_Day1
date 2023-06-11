import kotlin.properties.Delegates

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

    val array = arrayOf(1, 2, 3, 4)
    val array2 = arrayOf("Hello", "i'm", "Hải", 1, 2, 3, 4)
    array2[3] = 56
    println(array2[3])

    val arrayMutable = mutableListOf(1, 2, 3, 4, 5)
    arrayMutable.add(6)
    arrayMutable.removeAt(2)

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
}

fun forDemo() {
    val array2 = arrayOf("Hello", "i'm", "Hải", 1, 2, 3, 4)
    for (i in array2) {
        println(i)
    }
    for (i in array2.indices){
        println(i)
    }

    for (i in 0..10 step 2){
        println(i)
    }

    for (i in 0 until 10){
        println(i)
    }

    for (i in 10 downTo 0){
        println(i)
    }
}

fun alertArray() {
    val array = arrayOf(1, 2, 3, 4, 5,6,7,8,9,10)
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
