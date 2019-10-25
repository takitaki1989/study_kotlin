package chap6

fun square(i: Int): Int = i * i

fun main(args: Array<String>) {
    // 関数オブジェクトを取得して表示
    println(::square)
    // オブジェクトを変数に代入して呼び出す
    val functionObject: (Int) -> Int = ::square
    println(functionObject(15))

}

fun firstK(str: String): Int {
    fun isK(c: Char): Boolean = c == 'K'
    // 関数を渡す
    return first(str, ::isK)
}

fun firstUpperCase(str: String): Int {
    fun isUpperCase(c: Char): Boolean = c.isUpperCase()
    // 関数を渡す
    return first(str, ::isUpperCase)
}

// 高階関数(関数をパラメータとして受け取る)
fun first(str: String, predicate: (Char) -> Boolean): Int {
    tailrec fun go(str: String, index: Int): Int =
        when {
            str.isEmpty() -> -1
            predicate(str.first()) -> index
            else -> go(str.drop(1), index + 1)
        }
    return go(str, 0)
}
