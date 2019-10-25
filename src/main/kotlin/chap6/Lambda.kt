package chap6


fun main(args: Array<String>) {
    // ラムダ式の例
    val square: (Int) -> Int = {i: Int ->
        i * i
    }

    // 省略記法(squareと結果は一緒)
    val square2 = { i: Int ->
        i * i
    }

    // 省略記法(パラメータが1個の場合、変数名をitと省略できる)
    val square3: (Int) -> Int = {
        it * it
    }

    println(square(4))
    println(square2(4))
    println(firstWhitespace("yuhi sekine"))
    println(firstWhitespace2("yuhi sekine"))
    println(firstWhitespace3("yuhi sekine"))
}

// 最初の空白の位置を返す
fun firstWhitespace(str: String): Int {
    val isWhitespace: (Char) -> Boolean = {
        it.isWhitespace()
    }
    return first(str, isWhitespace)
}
// 最初の空白の位置を返す(ラムダ式をそのまま入れる)
fun firstWhitespace2(str: String): Int =
    first(str, { it.isWhitespace() })

// 最初の空白の位置を返す(構文糖衣)
fun firstWhitespace3(str: String): Int =
    first(str) {it.isWhitespace()}
