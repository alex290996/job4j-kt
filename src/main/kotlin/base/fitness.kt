package base

fun fitness(ivan: Int, nik: Int): Int {
    var month = 0
    var powerIvan = ivan
    var powerNik = nik
    while (powerIvan < powerNik) {
        powerIvan *= 3
        powerNik *= 2
        month++
    }
    return month
}
/**В данном примере мы использует серию от start .. finish. По умолчанию шаг итерации равен 1.
Итерация считает от 0 до 10.**/
fun add2(start: Int, finish: Int): Int {
    var rsl = 0;
    for (value in start .. finish) {
        rsl += value
    }
    return rsl
}
/**Пример от 0 до 10 без включения 10. Вместо многоточия используется until.
**/
fun show(start: Int, finish: Int) {
    for (value in start until finish) {
        println(value)
    }
}
/**Пример от 0 до 10 с шагом 2. Добавляем указание шага.**/
fun show2(start: Int, finish: Int) {
    for (value in start .. finish step 2) {
        println(value)
    }
}
/**А так же классика обхода в обратную сторону. В этом случае используется ключевое слово downTo**/
fun show3(start: Int, finish: Int) {
    for (value in finish downTo start step 2) {
        println(value)
    }
}

fun createArray() {
    val names =  arrayOfNulls<String>(10) //Он создаст массив на 10 элементов, в котором может быть null.
    names[0] = "Petr Arsentev"
    for (name in names) {
        if (name != null) {
            println(name.length)
        }
    }
}

fun createArrayList() {
    val names = ArrayList<String>()
    names.add("Petr Arsentev")
    for (name in names) {
        println(name)
    }
}
/**Итерирование с индексом.

Цикл for позволяет сразу получить значение индекса элемента. Для этого у каждой коллекции есть метод .withIndex()**/
fun createArray3() {
    val names =  arrayOfNulls<String>(10)
    names[0] = "Petr Arsentev"
    for ((index, name) in names.withIndex()) {
        println("$index " + name?.length)
    }
}

fun main() {
    val rsl = fitness(50, 90)
    println("Month : $rsl")

    val rsl2 = add2(0, 10)
    println("Sum from 0 to 10 is $rsl2")
}