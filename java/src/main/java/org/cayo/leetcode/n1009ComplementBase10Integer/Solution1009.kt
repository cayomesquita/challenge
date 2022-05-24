package org.cayo.leetcode.n1009ComplementBase10Integer

class Solution1009 {
    fun bitwiseComplement(n: Int): Int {
        if (n == 0) {
            return 1
        }
        if (n == 1) {
            return 0
        }
        val a = (Math.log(n.toDouble()) / Math.log(2.0)).toInt() + 1
        val b = Math.pow(2.0, a.toDouble()) - 1
        return b.toInt() - n
    }
}