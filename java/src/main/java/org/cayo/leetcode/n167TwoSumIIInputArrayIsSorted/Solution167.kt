package org.cayo.leetcode.n167TwoSumIIInputArrayIsSorted

class Solution167 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1
        while (left < right) {
            val sum = numbers[left] + numbers[right]
            if (sum == target){
                return intArrayOf(left+1, right+1)
            }
            if (sum > target) {
                right--
            } else {
                left++
            }
        }
        return intArrayOf(-1,-1)
    }
}