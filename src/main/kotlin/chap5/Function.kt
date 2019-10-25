package chap5

import java.util.concurrent.atomic.DoubleAccumulator

// 単純な関数
fun succ(i: Int): Int = i + 1
fun square(i: Int) = i * i
fun hello(name: String): String = "Hello! $name"
fun max(a: Int, b: Int): Int = if(b <= a) a else b
fun sub(minuend: Int, subtrahend: Int) = minuend - subtrahend
fun helloDefault(name: String = "World") = "Hello! ${name}"
// 可変長
fun sumVarArg(vararg ints: Int): Int {
    var sum = 0
    for(i in ints) {
        sum += i
    }
    return sum
}

// 文をもった関数
fun sum(ints: Array<Int>): Int {
    var sum = 0
    for(i in ints) {
        sum += i
    }
    return sum
}

// 結果を返さない関数
class Counter {
    private var cnt = 0
    // 返り値をUnitにすると、結果を返さない(returnが不要(あってもよい))
    fun countUp(): Unit {
        cnt ++
    }
    fun getCount(): Int = cnt
}

// 再帰
tailrec fun sumRecursion(numbers: List<Long>, accumulator: Long = 0): Long =
    if(numbers.isEmpty()) accumulator
    else sumRecursion(numbers.drop(1), accumulator + numbers.first())
// accumulatorを隠したバージョン
fun sumHideAccum(numbers: List<Long>): Long {
    tailrec fun go(numbers: List<Long>, accumulator: Long): Long =
        if(numbers.isEmpty()) accumulator
        else sumRecursion(numbers.drop(1), accumulator + numbers.first())
    return go(numbers, 0)
}


fun main(args: Array<String>) {
    println(succ(8))
    println(square(10))
    println(hello("sekine"))
    println(max(5,10))
    println(sum(arrayOf(1, 2, 3, 4, 5)))
    /**
     * 名前付き引数
     */
    println(sub(5, 3))
    // 下の2つは同じ結果になる
    println(sub(minuend = 10, subtrahend = 7))
    println(sub(subtrahend = 7,minuend = 10))
    // この2つも同じ結果
    println(helloDefault("World"))
    println(helloDefault())
    println(sumVarArg(1))
    println(sumVarArg(1, 2, 3, 4, 5))
    println(sumVarArg(*intArrayOf(1, 2, 3)))
    // 処理が長いのでコメントアウト
//    println(sumRecursion((1L..123456).toList()))
//    println(sumHideAccum((1L..123456).toList()))

    var counter = Counter()
    println(counter.getCount())
    counter.countUp()
    println(counter.getCount())


}