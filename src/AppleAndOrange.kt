fun main() {
    countApplesAndOranges(5, 10, 2, 13, arrayOf(5, 4, -3), arrayOf(-5, 1, -10))
}

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>) {
    var numberOfApples = 0
    for (i in apples) {
        val distance = a + i
        if (distance in s..t) numberOfApples++
    }

    var numberOfOranges = 0
    for (j in oranges) {
        val distance = b + j
        if (distance in s..t) numberOfOranges++
    }

    println(numberOfApples)
    println(numberOfOranges)
}
