package org.cayo.leetcode.`35_searchInsertPosition`

class Solution35 {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            val middle: Int = (left + right) / 2
            if (nums[middle] == target) {
                return middle
            }
            if (nums[middle] > target) {
                right = middle
            } else {
                left = middle + 1
            }
        }
        return if (nums[left] >= target) left else left + 1
    }
}