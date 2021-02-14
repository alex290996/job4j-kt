package base

fun add(first : Int, second : Int) : Int {
    return first + second
}

fun subtract(first : Int, second : Int) : Int {
    return first - second
}

fun max(first: Int, second: Int) : Int {
    return if (first > second) first else second
}

fun main(args:Array<String>){
    println("Hello from Kotlin")
    val age : Int = 18 //val - это аналоги final
    println("Age : $age")
    //val last : Double
    //val name : String
    //val size : Long
    //В Котлин, как и в Java, есть механизм inferred types. Если переменная объявляется со значением, то тип данных указывать не надо.
    //В Котлин так же поддерживаются изменяемые переменные. ключевое слово var.
   // var age = 32
    //age = 33 // possible reassigning
    val rsl = max(1, 2)
    println("max from 1 and 2 is $rsl")

    val plus = add(1, 1)
    println("1 + 1 = $plus")

    val minus = subtract(1, 1)
    println("1 - 1 = $minus")

}