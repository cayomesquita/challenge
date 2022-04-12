package org.cayo.leetcode.`557_ReverseWordsStringIII`

class Solution557 {
    fun reverseWords(s: String): String {
        var arr = s.toCharArray()
        var j = 0
        for (i in arr.indices) {
            if (arr[i] == ' ') {
                reverseWord(arr, j, i - 1)
                j = i + 1
            }
        }
        reverseWord(arr, j, arr.size - 1)
        return arr.joinToString("") { it.toString() }
    }

    fun reverseWord(arr: CharArray, _start: Int, _end: Int) {
        var start = _start
        var end = _end
        while (start < end) {
            swap(arr, start++, end--)
        }
    }

    fun swap(arr: CharArray, i: Int, j: Int) {
        var _arr = arr
        val aux = _arr[j]
        _arr[j] = _arr[i]
        _arr[i] = aux
    }
}