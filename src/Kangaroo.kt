fun main() {
    println(kangaroo(0, 3, 4, 2))
    println(kangaroo(0, 2, 5, 3))
    println(kangaroo(2, 3, 4, 2))
}

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    return if (v1 > v2 && ((x2 - x1) % (v1 - v2)) == 0) "YES" else "NO"
}
