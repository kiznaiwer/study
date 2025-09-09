package hmArray1

/*
 Напишите программу, которая проверяет, является ли массив чисел
палиндромом.
* Массив считается палиндромом, если он одинаково читается
как слева направо, так и справа налево.

 */
 fun main() {

     val arr = arrayOf(1, 2, 3, 4, 3, 2, 1)
     var m = 0
     var n = arr.size - 1
     var palindrome = true

     while(m < n){
         if (arr[m] != arr[n]){
             palindrome = false
         }
         m++
         n--
     }

     if (palindrome){
         println("The array is a palindrome")
     } else { println("The array is not a palindrome") }
 }