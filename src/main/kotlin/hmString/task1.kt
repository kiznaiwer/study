package hmString

import java.lang.StringBuilder

/*
Напишите программу,
которая принимает строку и переставляет слова в обратном порядке,
используя только методы String и StringBuilder
 */
fun main(){

    println("Enter the text: ")
    var input = readln()
    val text = input.split(" ")
    var res = StringBuilder()

    for (i in text.size - 1 downTo 0){
        res.append(text[i]).append(" ")
    }
    println(res)
}

// 2ой вариант
fun mainV2(){
    println("Enter the text: ")
    val text1 = readln()

}