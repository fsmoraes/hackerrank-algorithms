/*
* Given a square matrix, calculate the absolute difference between the sums of its diagonals.
    For example, the square matrix  is shown below:
    1 2 3
    4 5 6
    9 8 9
    The left-to-right diagonal = 1+5+9. The right to left diagonal = 3+5+9. Their absolute difference is |15-17| = 2.

=> Function description
    It must return an integer representing the absolute diagonal difference.
    diagonalDifference takes the following parameter:
    arr: an array of integers .

=> Input Format
    An array of array of integers

=> Output Format
    Print the absolute difference between the sums of the matrix's two diagonals as a single integer.
*/


fun main() {

    var arr = arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5, 6), arrayOf(10, 8, -12))

    var i = 0
    var j = arr.size - 1
    var primaryDiagonal = 0
    var secondDiagonal = 0

    for (item in arr) {
        primaryDiagonal += item[i]
        secondDiagonal += item[j]
        i++
        j--
    }

    println(Math.abs(primaryDiagonal - secondDiagonal))
}