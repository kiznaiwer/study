package homework

 fun main(){
  println("Введите число: ")
  val n = readln()?.toIntOrNull()
  var a = 0
  var b = 1
  var c = 3 // начало счетчика с 3 - уже есть два значения(0 и 1)
  while(c <= n!!){
   val d = a + b
   a = b
   b = d
   c += 1
  }
  println("Искомое число: $b")
 }