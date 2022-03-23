package org.cayo.leetcode

import Solution704
import org.cayo.AbstractTest
import org.junit.Test
import kotlin.test.assertEquals

class Solution704Test : AbstractTest() {

    @Test
    fun search() {
        assertEquals(4, Solution704().search(intArrayOf(-1,0,3,5,9,12), 9))
        assertEquals(-1, Solution704().search(intArrayOf(-1,0,3,5,9,12), 2))
        assertEquals(-1, Solution704().search(intArrayOf(-1,0,3,5,9,12), 13))
    }
}