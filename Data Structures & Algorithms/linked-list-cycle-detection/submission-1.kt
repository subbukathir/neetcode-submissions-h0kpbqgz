/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if(head == null) return false
        var fastPtr = head
        var slowPtr = head

        while(fastPtr?.next != null){
            slowPtr = slowPtr?.next
            fastPtr = fastPtr.next?.next

            if(slowPtr == fastPtr){
                return true
            }
        }
        return false 
    }
}
