package chap4

fun main(args: Array<String>) {
    /**
     * whileループ
     */
    var count = 3
    // while文
    while (count-- > 0)
        println("$count : Hello!")

    // do-while文(while文とは違って、一回は実行される)
    // do内の変数をループ判定条件に利用可能
    do {
        println("Hello!")
        val next = Math.random() < 0.5
    } while (next)

    /**
     * forループ
     */
    for(x in arrayOf(1, 2, 3)) {
        println(x)
    }
    val names = listOf("foo", "bar", "baz")
    for(name in names) {
        println(name)
    }
    for(i in 1..10 step 2) {
        println(i) // 1～10まで2ずつ出力する
    }

    // next(), hasNext()を実装したクラスでループさせることも可能
    println("----------")
    for(item in MyIterable()) {
        println(item)
    }

    /**
     * breakの例
     */
    var barIndex = -1
    for(index in names.indices) {
        if(names[index] == "baz") {
            barIndex = index
            break
        }
    }
    println(barIndex)


}

class MyIterator {
    operator fun hasNext(): Boolean = Math.random() < 0.5
    operator fun next(): String = "Hello"
}

class MyIterable {
    operator fun iterator() = MyIterator()
}
