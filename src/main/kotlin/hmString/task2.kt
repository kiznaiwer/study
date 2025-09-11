package hmString
/*
Реализуйте программу, котораяя преобразует строку
в последовательность ASCII-кодов и строку кодов  в текст,
используя циклы и методы String
 */
fun main(){
    var str = "Home work"
    for (i in 0..str.length - 1){
        print(str[i].code)
        print(',')
    }

    println("\n")

    for (i in 0..str.length - 1){
        print(str[i].code.toChar())
    }
}