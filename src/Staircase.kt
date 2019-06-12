fun main() {
    val n = 6

    for (simbolo in 1..n) {
        val espacos = n - simbolo

        println(" ".repeat(espacos) + "#".repeat(simbolo))
    }
}