package org.cayo.leetcode.n977SquaresSortedArray

class Solution977 {
    fun sortedSquares(nums: IntArray): IntArray {
        val arr = IntArray(nums.size)
        var left = 0
        var right = nums.size - 1
        var index = right
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                arr[index--] = nums[left] * nums[left]
                left++
            } else {
                arr[index--] = nums[right] * nums[right]
                right--
            }
        }
        return arr
    }
}