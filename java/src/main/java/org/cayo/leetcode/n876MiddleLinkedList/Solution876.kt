package org.cayo.leetcode.n876MiddleLinkedList

import org.cayo.leetcode.common.ListNode

class Solution876 {
    fun middleNode(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }
        var middle = head
        var curr = head
        var stepFlag = true
        while (curr?.next != null) {
            if (stepFlag) {
                middle = middle?.next
            }
            stepFlag = !stepFlag
            curr = curr?.next
        }
        return middle
    }
}