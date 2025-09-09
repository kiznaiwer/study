package hmArray1

/*
Напишите программу, которая принимает массив целых чисел
и подсчитывает, сколько четных и сколько нечетных чисел в
нем содержится
 */

fun main(){
    var arr = arrayOf(3, 4, 76, 89, 12, 19, 33, 34, 56, 43, 10, 6)
    var evNum = 0
    var odd = 0
    for (i in arr){
        if (i % 2 == 0){
            evNum++
        } else if(i % 2 != 0){
            odd++
        }
    }
    println("The number of even numbers: $evNum")
    println("The nomber of odd numbers: $odd")
}