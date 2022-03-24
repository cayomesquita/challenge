package org.cayo.leetcode.`189_RotateArray`

class Solution189 {
    fun rotate(nums: IntArray, _k: Int): Unit {
        if (_k == 0 || _k == nums.size) {
            return
        }
        var k = _k % nums.size
        reverse(nums, 0, nums.size - 1)
        reverse(nums, 0, k - 1 )
        reverse(nums, k, nums.size - 1)
    }

    fun reverse(nums: IntArray, _start:Int, _end:Int) {
        var start = _start
        var end = _end
        while(start < end){
            var aux = nums[start]
            nums[start++] = nums[end]
            nums[end--] = aux
        }
    }
}