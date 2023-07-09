package org.cayo.leetcode.n1144DecreaseElementsArrayZigzag

import kotlin.math.min

class Solution1144 {
    fun movesToMakeZigzag(nums: IntArray): Int {
        var countEvenHigher:Int = 0
        var countEvenLower:Int = 0
        var numsEvenHigher = nums.clone()
        var numsEvenLower = nums.clone()
        for (i in 1 until nums.size) {
            if (i % 2 == 0) { // i is even
                while (numsEvenHigher[i] <= numsEvenHigher[i-1]) { // even higher
                    numsEvenHigher[i-1]--
                    countEvenHigher++
                }
                while (numsEvenLower[i] >= nums[i-1]) { // even lower
                    numsEvenLower[i]--
                    countEvenLower++
                }
            } else { // i is odd
                while (numsEvenHigher[i] >= numsEvenHigher[i-1]) { // even higher
                    numsEvenHigher[i]--
                    countEvenHigher++
                }
                while (numsEvenLower[i] <= numsEvenLower[i-1]) { // even lower
                    numsEvenLower[i-1]--
                    countEvenLower++
                }
            }

        }
        return min(countEvenHigher, countEvenLower)
    }
}