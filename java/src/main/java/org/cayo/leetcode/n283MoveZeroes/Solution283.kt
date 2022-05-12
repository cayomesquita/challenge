package org.cayo.leetcode.n283MoveZeroes

class Solution283 {
    fun moveZeroes(nums: IntArray): Unit {
        var firstZero = -1
        for (i in nums.indices) {
            val num = nums[i]
            if ( num == 0 ) {
                if (firstZero < 0) {
                    firstZero = i
                }
            } else {
                if (firstZero >= 0) {
                    swap(nums, i, firstZero++)
                }
            }
        }
    }

    fun swap(nums: IntArray, i: Int, j: Int) {
        val aux = nums[i]
        nums[i] = nums[j]
        nums[j] = aux
    }
}