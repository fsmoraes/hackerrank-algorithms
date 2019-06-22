fun main() {
    println(birthdayCakeCandles(arrayOf(3, 2, 1, 3)))
}

fun birthdayCakeCandles(arr: Array<Int>): Int {

    var numberOfCandles = 0
    var largerValue = 0

    for (i in arr) {
        if (largerValue == i) {
            numberOfCandles++
        } else if (i > largerValue) {
            largerValue = i
            numberOfCandles = 1
        }
    }

    return numberOfCandles
}