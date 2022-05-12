package org.cayo.leetcode

import Solution567
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Solution567Test {

    @Test
    fun checkInclusion() {
        assertEquals(true, Solution567().checkInclusion("ab","eidbaooo"))
        assertEquals(true, Solution567().checkInclusion("abo","eidbaooo"))
        assertEquals(true, Solution567().checkInclusion("abo","eibbaooo"))
        assertEquals(true, Solution567().checkInclusion("abo","eibabaooo"))
        assertEquals(true, Solution567().checkInclusion("abo","eiabbaooo"))
        assertEquals(true, Solution567().checkInclusion("ky","ainwkckifykxlribaypk"))
    }
}