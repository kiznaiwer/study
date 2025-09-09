package hmArray1

/*
Напишите программу, которая принимает массив целых чисел и изменяет
его порядок на обратный. Выведите результат после изменения порядка.
 */

 fun main(){
     var arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
     var check = arr.size
     for (i in 0 until check / 2) {
         val el = arr[i]
         arr[i] = arr[check - 1 - i]
         arr[check - 1 - i] = el
     }
     println(arr.contentToString())
 }