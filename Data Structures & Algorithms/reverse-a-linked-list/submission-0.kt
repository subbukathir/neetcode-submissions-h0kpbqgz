/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if(head == null) return null

        val values = mutableListOf<Int>()
        var curr = head
        while(curr != null){
            values.add(curr.`val`)
            curr = curr.next
        }

        val newHead = ListNode(values.last())
        var temp = newHead
        for(i in values.size - 2 downTo 0){
            temp.next = ListNode(values[i])
            temp = temp.next!!
        }
        return newHead
    }
}
