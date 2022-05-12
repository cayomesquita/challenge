import java.util.*

class Solution567 {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) {
            return false
        }
        var sum = 0
        var start = 0
        var letters = HashMap<Char, Int>()
        val arr = s2.toCharArray()
        for (c in s1) {
            letters.computeIfAbsent(c) { k -> 0 }
            letters.computeIfPresent(c) { k, v -> v + 1 }
        }
        val base = Collections.unmodifiableMap(HashMap(letters))
        for (end in arr.indices) {
            val curr = arr[end]
            if (letters.containsKey(curr)) {
                if (letters.get(curr) == 0) {
                    // TODO: 2022-05-12
                    while (letters.get(curr) == 0) {
                        letters.computeIfPresent(arr[start++]) { k, v -> v + 1 }
                        sum--
                    }
                }
                letters.computeIfPresent(curr) { k, v -> v - 1 }
                if (s1.length == ++sum) {
                    return true
                }
            } else {
                sum = 0
                letters = HashMap(base)
                start = end + 1
            }
        }
        return false
    }
}