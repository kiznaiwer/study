package homeArr2
/*
    Напишите функцию, которая сортирует массив по частоте появления
    элементов(п оубыванию). Если два элемента встречаются одинаковое
    количество раз, сортируйте их по возрастанию.
 */
fun main() {
    val arr = arrayOf(4, 5, 6, 5, 4, 3)


    for (i in 0 until arr.size - 1) {
        for (j in 0 until arr.size - i - 1) {
            val num1 = rate(arr[j], arr)
            val num2 = rate(arr[j + 1], arr)

            if (num1 < num2 || (num1 == num2 && arr[j] > arr[j + 1])) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }

    println(arr.contentToString())
}

fun rate(num: Int, arr: Array<Int>): Int {
    var count = 0
    for (element in arr) {
        if (element == num) count++
    }
    return count
}
