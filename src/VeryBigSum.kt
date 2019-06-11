/* A Very Big Sum
* Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

=> Function Description
   The aVeryBigSum function must return the sum of all array elements.

=> Input Format
    An array of integers

=> Output Format
    Print the integer sum of the elements in the array.

=> Sample Input
   [1000000001, 1000000002, 1000000003, 1000000004, 1000000005]

=> Output
   5000000015
*/
fun aVeryBigSum(arr: Array<Long>): Long {
    var sum: Long = 0

    for (i in arr) {
        sum += i
    }

    return sum
}

fun main() {
    val arr = arrayOf<Long>(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)
    val result = aVeryBigSum(arr)

    println(result)
}