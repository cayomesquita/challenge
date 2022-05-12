package org.cayo.leetcode.n3LongestSubstringWithoutRepeatingCharacters

class Solution3 {
    fun lengthOfLongestSubstring(s: String): Int {
        var maximum: Int = 0
        var start: Int = 0
        var charPositions = HashMap<Char, Int>()
        val arr = s.toCharArray()
        for (i in arr.indices) {
            val position = charPositions.put(arr[i], i)
            if (position != null && position >= start) {
                start = position + 1
            }
            val length = i - start + 1
            maximum = Math.max(maximum, length)
        }
        return maximum
    }
}