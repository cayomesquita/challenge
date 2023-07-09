package org.cayo.leetcode.n1144DecreaseElementsArrayZigzag

import org.junit.Test
import kotlin.test.assertEquals

class Solution1144Test {
    @Test
    fun movesToMakeZigzag() {
        assertEquals(2,Solution1144().movesToMakeZigzag(intArrayOf(1,2,3)))
        assertEquals(4,Solution1144().movesToMakeZigzag(intArrayOf(9,6,1,6,2)))
    }
}