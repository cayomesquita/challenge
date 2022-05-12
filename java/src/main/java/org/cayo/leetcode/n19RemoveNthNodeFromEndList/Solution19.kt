package org.cayo.leetcode.n19RemoveNthNodeFromEndList

import org.cayo.leetcode.common.ListNode
import java.util.LinkedList

class Solution19 {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var list = LinkedList<ListNode>()
        var node = head
        while (node != null) {
            if (list.size > n) {
                list.pollLast()
            }
            list.push(node)
            node = node.next
        }
        if (list.size == n) {
            return head?.next
        }
        val aux = list.pollLast()
        aux.next = aux.next?.next
        return head
    }

}