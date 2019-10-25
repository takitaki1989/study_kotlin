package chap6


fun main(args: Array<String>) {
    log { "このメッセージは出力される" }
    log(false) {"このメッセージは出力されない"}
}

fun log(debug: Boolean = true, message: () -> String) {
    if(debug) {
        println(message())
    }
}

// インライン関数として呼び出す
inline fun log2(debug: Boolean = true, message: () -> String) {
    if(debug) {
        println(message())
    }
}
