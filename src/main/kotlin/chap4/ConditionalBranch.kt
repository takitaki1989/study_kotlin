package chap4

fun main(args: Array<String>) {
    // 必ず実行される
    if(true)
        println("hello!")

    // 5が1～10ならばtrue
    if(5 in 1..10) {
        println("wawa")
        println("hoho")
    }

    // falseの場合、中括弧の中にはいかない
    if(1 + 2 < 3) {
        println("ここにはこない")
    }

    val score = 50
    if(score >= 60) {
        // 60以上なら
        println("合格")
    } else {
        // それ以外
        println("不合格")
    }

    // 上記と同じ。 単純な場合はこんな書き方で良い
    val message = if(score >= 60) "合格" else "不合格"
    println(message)

    val x = if (true) {
        1
        2 // 最後の値が返される。 1は返されない
    } else {
        3
    }
    println(x)

    val score2 = 75
    val grade =
        if(score2 >= 90) 'A'
        else if(score2 >=80) 'B'
        else if(score2 >=70) 'C'
        else if(score2 >=60) 'D'
        else 'F'

    println(grade)

    /**
     * when 式
     */
    var x2 = 5
    when(x2) {
        1 -> println("one")
        2, 3 -> println("two or three")
        else -> {
            println("unknown")
        }
    }
    println(x2)

    var x3 = 10
    when(x3) {
        1 -> println("one")
        in 2..10 -> println("1 <= x <= 10") // rangeも指定可能
        else -> println(x.toString())
    }

    val x4 = "abc"
    val blank = when (x4) {
        is String -> x4.isBlank() // String型かどうか
        else -> true
    }
    println(blank)





}