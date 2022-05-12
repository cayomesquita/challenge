class Solution704 {
    fun search(nums: IntArray, target: Int): Int {
        val index = binarySearch(nums,0, nums.size - 1, target)
        return index
    }

    fun binarySearch(nums: IntArray, startIndex: Int, endIndex: Int, target: Int) : Int {
        if (startIndex == endIndex) {
            return if (nums[startIndex] == target) startIndex else -1
        }
        val middle : Int = (startIndex + endIndex) / 2
        val value = nums[middle]
        if (value == target) {
            return middle
        }
        return if (value > target) binarySearch(nums, startIndex, middle, target) else binarySearch(nums, middle + 1, endIndex, target)
    }
}