/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if(head == null) return null

        val stack = ArrayDeque<Int>()
        var curr = head
        while(curr != null){
            stack.add(curr.`val`)
            curr = curr.next
        }

        val newHead = ListNode(stack.removeLast())
        var temp = newHead
        while(stack.isNotEmpty()){
            temp.next = ListNode(stack.removeLast())
            temp = temp.next!!
        }
        return newHead
    }
}
