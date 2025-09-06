package hmGit
    /*
        Попросите пользователя ввести число и определите, является ли оно
    простым. Простое число — это число, которое делится только на 1 и само
    на себя. Используйте цикл для проверки всех возможных делителей
     */

 fun main() {
     println("Enter a number")
     val number  = readln()!!.toInt()
     var prime = true

     if(number < 2){
         prime = false
     } else {
         for (i in 2 until number){
             if (number % i == 0){
                 prime = false
                 break
             }
         }
     }

     if(prime){
         println("$number is a prime number")
     } else {
         println("$number is not a prime number")
     }
 }