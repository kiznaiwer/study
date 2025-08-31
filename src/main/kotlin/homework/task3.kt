package homework

 fun main(){
     print("Введите число: ")
     val n = readln()?.toIntOrNull()

     for (i in 1..10){
         if (n != null) {
             println("$n * $i = ${n*i}")
         }
     }
 }