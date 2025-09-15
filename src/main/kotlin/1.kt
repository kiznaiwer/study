/*
    Отсортируйте массив, чтобы отрицательные числа
    находились перед положительными, сохраняя порядок
    внутри каждой группы
 */

fun main() {
    val arr = arrayOf(-5, 1, 3, -23, 9, 0, -1, -4)
    val arrResult = Array(arr.size) { 0 }

    var step = 0

    for (i in 0..arr.size - 1) {
        if (arr[i] < 0) {
            arrResult[step] = arr[i]
            step++
        }
    }

    for (i in 0..arr.size - 1) {
        if (arr[i] >= 0) {
            arrResult[step] = arr[i]
            step++
        }
    }

    println(arrResult.contentToString())
}
