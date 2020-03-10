object EnoughIsEnough {
    fun deleteNth(elements: IntArray, maxOcurrences: Int): IntArray {
        val countMap = mutableMapOf<Int, Int>()
        val result = mutableListOf<Int>()

        elements.forEach {
            if (countMap[it] == null)
                countMap[it] = 1
            else
                countMap[it] = countMap[it]!! + 1

            if (countMap[it]!! <= maxOcurrences) {
                result.add(it)
            }
        }

        return result.toIntArray()
    }
}

fun main() {
    EnoughIsEnough.deleteNth(intArrayOf(1, 1, 1, 1), 2).forEach { print(it) }
    println()
    EnoughIsEnough.deleteNth(intArrayOf(20, 37, 20, 21), 1).forEach { print(it) }
}