package org.cayo.leetcode.n268MissingNumber

class Solution268 {
    fun missingNumber(nums: IntArray): Int {
        var sumA = 0
        var sumB = 0

        for (i in nums.indices) {
            sumA += nums[i]
            sumB += i+1
        }

        return sumB - sumA
    }


}