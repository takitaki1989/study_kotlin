package chap6

fun main(args: Array<String>) {
    // ラムダ式
    val square1 : (Int) -> Int = { i: Int ->
        i * i
    }

    // 無名関数
    val square2 : (Int) -> Int = fun(i: Int): Int {
        return i * i
    }

    // 無名関数 省略ｖｅｒ
    val square3 : (Int) -> Int = fun(i:Int) = i * i

}


