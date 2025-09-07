package hmGit

import kotlin.time.times

//Обратнвя лесенка
fun main(){
     println("Enter the number of characters: ")
     var symbol = readln()!!.toInt()
     while(symbol > 0){
         println("#".repeat(symbol))
         symbol -= 1
     }

 }