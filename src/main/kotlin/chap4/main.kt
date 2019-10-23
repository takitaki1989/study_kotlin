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

    val ints2: IntArray = intArrayOf(1, 2, 3) // int型用の配列はintArray
    println(ints[0])
    val chars: CharArray = charArrayOf('a', 'b') // char型用の配列はcharArray
    println("${chars[0]}, ${chars[1]}")

    /**
     * リスト
     */

    val ints3: List<Int> = listOf<Int>(1, 2, 3)
    println(ints3)
    println(ints3.size) // 要素数を取得する
    println(ints3[0]) // 1番目
//    ints3[0] = 5 // Listに対して値を格納することは出来ない
//    ints3 += 4 // Listに対しては値の追加も出来ない。 削除もできない(そもそもremoveAt()がない)
    val ints4: MutableList<Int>  = mutableListOf<Int>(1, 2, 3)
    ints4[0] = 5 // MutableListであれば、値の変更は可能
    println(ints4[0]) // 1番目
    // MutableListであれば、要素の追加、削除も可能
    ints4 += 5 // 要素の追加
    println(ints4)
    ints4.removeAt(2) // 3番目の要素を削除
    println(ints4)

    /**
     * セット
     */
    val intsSet: Set<Int> = setOf(1, 2, 1, 3)
    println(intsSet)    // 片方の1は重複しているので除外される
    val charsSet: MutableSet<Char> = mutableSetOf('a', 'b', 'a')
    println(charsSet)
    charsSet -= 'a' // 'a' を削除
    println(charsSet)

    /**
     * マップ
     */
    val numberMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2)
    println(numberMap)
    println(numberMap.size) // 要素数を取得
    println(numberMap["one"]) // 要素を指定
    println(numberMap["three"]) // 存在しない場合、nullを返す。 エラーにはならない
    numberMap += "three" to 3 // 要素の追加できる(ミュータブルなら)
    println(numberMap)

    /**
     * レンジ
     */
    println(5 in 1..10) // 1～10に5は存在するか
    val range: IntRange = 12..15 // rangeというオブジェクトを生成
    println(5 in range) // 12～15に5は存在するか
    println(5 !in range) // 12～15に5は存在しないのか(!は否定)
    println((1..5).toList()) // range をリストに変換
    println((1..5).reversed().toList()) // 要素を引っくり返した後、リストに変換
    println((5 downTo 1).toList()) // 上と同じ。 downToで降順になる
    println((1..5 step 2).toList()) // 1～5まで、2つずつ刻む
    println((100 downTo 0 step 25).toList()) // 100～0まで25ずつ刻む
}