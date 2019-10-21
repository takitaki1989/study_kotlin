package chap3

fun main(args: Array<String>) {
    val half = Rational(1, 2)
    println(half.denominator) // 分母を表示
    println(half)
    // println(Rational(1, 0)) // これはエラーになる

    // 約分
    println(Rational(55, 100))

    // 加算(分数同士)
    println(Rational(1,2) + Rational(1, 5))
    println(Rational(1,6) + Rational(1, 3) + Rational(1, 2))

    // 加算(分数＋整数)
    println(Rational(1,2) + 1)
    println(Rational(1,1) + 2)

    // 加算(整数＋分数)
    println(1 + Rational(1,2))
    println(2 + Rational(1,1))
}