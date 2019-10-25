package chap6

fun main(args: Array<String>) {
    var counter1 = getCounter()
    var counter2 = getCounter()

    println(counter1())
    println(counter1())
    println(counter2())
    println(counter1())
    println(counter2())
}

fun foo(): Int {
    val a = 1
    val b = 2
    return a + b
}

fun bar(): Int {
    val c = 3
    // return a + c // cは参照できない
    return c
}

fun getCounter(): ()-> Int {
    var count = 0
    return {
        count++
    }
}