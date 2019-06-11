import java.text.DecimalFormat


/*
* Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros.
* Print the decimal value of each fraction on a new line.

 => Function Description
    It should print out the ratio of positive, negative and zero items in the array,
    each on a separate line rounded to six decimals.

    You must print the following  lines:
    A decimal representing of the fraction of positive numbers in the array compared to its size.
    A decimal representing of the fraction of negative numbers in the array compared to its size.
    A decimal representing of the fraction of zeros in the array compared to its size.
*/

fun main() {
    val arr = arrayOf(-4, 3, -9, 0, 4, 1)

    val arrSize = arr.size
    var positiveSum = 0.0
    var negativeSum = 0.0
    var zerosSum = 0.0
    val df = DecimalFormat("#.######")

    for (i in arr) {
        when {
            i == 0 -> zerosSum++
            i > 0 -> positiveSum++
            else -> negativeSum++
        }
    }

    println(df.format(positiveSum / arrSize))
    println(df.format(negativeSum / arrSize))
    println(df.format(zerosSum / arrSize))
}