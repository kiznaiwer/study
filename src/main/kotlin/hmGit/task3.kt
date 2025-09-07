package hmGit
/*
Напишите программу, которая принимает на вход положительное число
и находит сумму его цифр, повторяя процесс, пока результат не станет
однозначным числом (например, для 9875: 9+8+7+5 = 29, затем 2+9 = 11, и,
наконец, 1+1 = 2).
 */
 fun main(){
     var sum = 0
     println("Enter a number")
    var number = readln()!!.toInt()
    while(number > 9){
        sum += number % 10
        number /= 10
        println(number)
    }
    println("The desired number: $sum")
 }