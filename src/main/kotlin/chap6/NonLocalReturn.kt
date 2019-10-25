package chap6

fun main(args: Array<String>) {
    println(containsDigit("124str"))
    println(containsDigit("str"))
    println(containsDigit2("124str"))
    println(containsDigit2("str"))
    println(containsDigit3("124str"))
    println(containsDigit3("str"))
}

// 文字列を捜査するインライン関数
inline fun forEach(str: String, f: (Char) -> Unit) {
    for(c in str) {
        f(c)
    }
}

// 非ローカルリターン
fun containsDigit(str: String): Boolean {
    forEach(str) {
        if(it.isDigit())
            return true
    }
    return false
}

// ラベルを利用したリターン
fun containsDigit2(str: String): Boolean {
    var result = false
    forEach(str) here@ {
        if(it.isDigit()) {
            result = true
            return@here
        }
    }
    return result
}

// 関数名を指定したリターン
fun containsDigit3(str: String): Boolean {
    var result = false
    forEach(str) {
        if(it.isDigit()) {
            result = true
            return@forEach
        }
    }
    return result
}
