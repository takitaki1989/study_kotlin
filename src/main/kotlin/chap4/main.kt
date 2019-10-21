package chap4

fun main(args: Array<String>) {
    println(27) // 整数
    println("Kotlin") // 文字列
//    print(TOKYO) // これはエラーになる

    println(123.4) // 浮動小数点
    println(123.4e2) // 指数(123.4*10の2乗(123.4 * 100))
    println(123.4E-1) // Eもeも同じ(123.4 * 0.1)

    println(1234) // 10進数
    println(0xFF) // 16進数
    println(0b1010) // 2進数(8進数を表現する記法は使えない)

    println(1 + 2) // 足し算
    println(1 + 2 * 3) // *が優先

    println(1 < 2) // true
    println(5 == 0) // false
    println(12 <= 5 + 3 * 2) // false

    println(true)
    println(false)
    println('9') // Char型(1文字)

    println('\u592a') // Char型(1文字) ユニコード
    println('\u90ce') // Char型(1文字) ユニコード

    println("\u592a \t \u90ce")

    val foo: Int = 123 // 変数の宣言と代入
    println(foo)
    println(foo + 5)
    val bar: String = "Hello"
    println(bar)
//    val baz: Long = "Japan" // 型が違うとエラー

    // var は再代入OK
    var a: Int = 5
    println(a)
    a = 3
    println(a)
    val b: Int = 5
    println(b)
//    b = 0 // valに対して再度代入しようとするとエラー
    // 変数は、valを使った方が良い

    val int: Int = 123
    // val long: Long = int // これはエラーになる(型が違うから)
    val long: Long = int.toLong() // 型変換すればOK
    println(long)
    println(75.toChar())
    println('A'.toInt())

    val name = "Taro" // 型指定しなくても大丈夫
    println("Hello, " + name + "!")
    println("Hello, $name!") // $ + 変数名で変換できる！

    println("""
        Hello, $name!
    """.trimIndent()) // トリプルクォートってのもある。 trimIndent()はインデントを除去する(そのまま)

    println("""
        |It's
        |sunny
        |today
    """.trimMargin()) // trimMargin()は|を除去する

    /**
     * 配列
     */

    val ints = arrayOfNulls<Int>(5) // 要素数が5の配列
    println(ints.size)
    println(ints[0]) // 宣言しただけなのでnull
    ints[0] = 123 // 配列にセット
    println(ints[0])
    ints[0] = 345 // 配列にセット(配列自体はval だが、要素への再代入はできる)
    println(ints[0])

    val strs = arrayOf("red", "green", "blue") // 型を明示しなくても大丈夫
    println(strs[0])







}