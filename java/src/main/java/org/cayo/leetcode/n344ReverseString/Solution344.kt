package org.cayo.leetcode.n344ReverseString

class Solution344 {
    fun reverseString(s: CharArray): Unit {
        var left = 0
        var right = s.size - 1
        while (left < right){
            swap(s, left++, right--)
        }
    }

    fun swap(s: CharArray, a:Int, b:Int) {
        val aux = s[a]
        s[a] = s[b]
        s[b] = aux
    }
}