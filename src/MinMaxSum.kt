
/*
* Given five positive integers, find the minimum and maximum values that can be calculated
* by summing exactly four of the five integers.
* Then print the respective minimum and maximum values as a single line of two space-separated long integers.
* */

fun main() {

    val arr = arrayOf(1, 3, 5, 7, 9)

    var min = arr[0]
    var max = min
    var total = 0L

    for (i in arr) {
        if (i < min) {
            min = i
        } else if (i > max) {
            max = i
        }

        total += i
    }

    val minValue = total - max
    val maxValue = total - min

    print("$minValue $maxValue")
}