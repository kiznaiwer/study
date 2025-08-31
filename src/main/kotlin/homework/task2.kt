package homework

 fun main(){
     print("Введите количество баллов: ")
     val scores = readln()?.toIntOrNull()

     val certification = when (scores){
         in 90..100 ->"A"
         in 75..89 ->"B"
         in 50..74 -> "C"
         in 30..49 ->"D"
         in 0..29 ->"F"
         else -> {"Ошибка"}
     }

     println("Оценка студента: $certification")
 }