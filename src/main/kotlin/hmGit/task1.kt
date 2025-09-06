package hmGit

 fun main(){
     println("Enter a number")
     val number = readln()
     if (number == number.reversed()){
         println("$number is a palindrome")
     } else {
         println("$number is not a palindrome")
     }
 }