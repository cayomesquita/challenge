class Solution {
    fun search(nums: IntArray, target: Int): Int {
        val index = binarySearch(nums,0, nums.size, target)
    }

    fun binarySearch(nums: IntArray, startIndex: Int, endIndex: Int, target: Int) : Int{

        val value = nums(index)
        if (value == target) {
            return index
        }
        if (value > target) {

        }
        return -1
    }
}