package hmGit

     /*
    Напишите программу, которая проверяет, является ли введённое
    пользователем число палиндромом (читается одинаково слева направо и
    справа налево). Используйте цикл для разбиения числа и сравнения цифр.
      */
fun main() {
    println("Enter a number: ")
    val num1 : String = readln()
         if (num1 == num1.reversed()){ println("The number $num1 is a palindrome") }
         else { println("The number $num1 is a not palindrome") }
}