fun main(args: Array<String>) {
    println("Введите высоту: ")
    val height = readln()!!.toDouble()
    println("Введите ширину: ")
    val width = readln()!!.toDouble()
    println("Периметр прямоугольника: " + (2 * height + 2 * width))
    println("Площадь прямоугольника: " + (height * width))

}