package org.cayo.leetcode.n278FirstBadVersion

class Solution278 {
    fun firstBadVersion(n: Int) : Int {
        var left = 1
        var right = n
        while (left < right) {
            val middle : Int = left + (right - left) / 2
            if(isBadVersion(middle)){
                right = middle
            } else {
                left = middle + 1
            }
        }
        return left
    }

    private fun isBadVersion(middle: Int): Boolean {
        TODO("It is supposed to be a super class method")
    }
}