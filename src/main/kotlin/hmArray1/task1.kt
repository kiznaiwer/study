package hmArray1
/*
Напишите программу, которая находит и выводит максимальное и
минимальное значение в массиве целых чисел. Также вычислите индекс
этих элементов.

 */

 fun main() {
     val arr = arrayOf(3, 1, 5, 9, 8, 6, 2)
     var max = arr[0]
     var min = arr[0]

     for(i in 0..(arr.size - 1)){
         if (arr[i] > max){
             max = arr[i]
         }

         if (arr[i] < min){
             min = arr[i]
         }
     }
     println("$max is the largest number.")
     println("$min is the smallest number.")

 }