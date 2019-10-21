package chap3

import kotlin.math.abs

/**
 * プライマリコンストラクタ
 */
// valは変更不可。
class Rational(val n: Int, val d: Int) {
    // イニシャライザ
    init {
        require(d != 0, {"denominator must not be null!"})
    }
    private val g = gcd(abs(n), abs(d))
    val numerator: Int = n / g
    val denominator: Int = d / g

    override fun toString(): String = "${numerator}/${denominator}" // 中括弧をなくしても動く！

    // 約分をしてくれるメソッド
    tailrec private fun gcd(a: Int, b:Int): Int =
        if(b == 0) a
        else gcd(b, a % b)

    // 足し算をするメソッド(分数同士)
    operator fun plus(that: Rational) =
        Rational(
            numerator * that.denominator + that.numerator * denominator,
            denominator * that.denominator)

    // 足し算をするメソッド(整数)
    operator fun plus(n: Int): Rational =
        Rational(
            numerator + n * denominator,  denominator)
}

// 拡張関数(すでに定義されているplusメソッドを利用するために、逆にしているだけ)
operator fun Int.plus(r: Rational): Rational = r + this