package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var precedingIndex = 0
        var letterCounter = 0

        for (symbolB in b) {
            for ((indexA, symbolA) in a.withIndex()) {
                if (symbolB == symbolA.toUpperCase() || symbolB == symbolA.toLowerCase()) {
                    if (precedingIndex > indexA) return "NO"
                    precedingIndex = indexA
                    letterCounter++
                }
            }
        }
        return if (letterCounter == b.length) "YES" else "NO"
    }
}
