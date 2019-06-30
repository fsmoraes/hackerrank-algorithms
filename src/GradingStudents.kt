import java.util.*
/*
    https://www.hackerrank.com/challenges/grading/problem
*/
fun main() {

    val grades = arrayOf(73, 67, 38, 33)
    val newGrades = mutableListOf<Int>()

    for (grade in grades) {

        if (grade < 38) {
            newGrades.add(grade)
        } else {

            var tempGrade = grade

            while (tempGrade % 5 != 0) {
                tempGrade++
            }

            val difGradle = tempGrade - grade
            if (difGradle < 3) {
                newGrades.add(tempGrade)
            } else {
                newGrades.add(grade)
            }
        }
    }

    println(Arrays.toString(newGrades.toTypedArray()))

}