package org.cayo.leetcode.n2453DestroySequencialTargets

class Solution2453 {
    data class Counter(var count: Int, var lowerKeyIndex: Int)
    fun destroyTargets(nums: IntArray, space: Int): Int {
        var map = HashMap<Int, Counter>()
        var bestCount = 0
        for (i in 0 until nums.size){
            var key = nums[i] % space
            var counter = map.computeIfAbsent(key) { k -> Counter(0, i) }
            counter.count++
            counter.lowerKeyIndex = if (nums[i] < nums[counter.lowerKeyIndex]) i else counter.lowerKeyIndex
            if (counter.count > bestCount){
                bestCount = counter.count
            }
        }

//        var minValue: Int? = null
//        for ((_, c) in map) {
//            if (c.count == bestCount) {
//                val value = nums[c.lowerKeyIndex]
//                if (minValue == null || value < minValue) {
//                    minValue = value
//                }
//            }
//        }
//        return minValue!!;

        return map.asIterable().filter { (_, c) -> c.count == bestCount }.minOf { (_, c) -> nums[c.lowerKeyIndex] }
    }
}