package org.cayo.leetcode.n268MissingNumber

import org.junit.Test
import kotlin.test.assertEquals

internal class Solution268Test {
    @Test
    fun missingNumber() {
        assertEquals(2, Solution268().missingNumber(intArrayOf(3,0,1)))
        assertEquals(2, Solution268().missingNumber(intArrayOf(0,1)))
        assertEquals(8, Solution268().missingNumber(intArrayOf(9,6,4,2,3,5,7,0,1)))
    }
}