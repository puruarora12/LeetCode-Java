/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null)
            return null;
        ListNode current =head;
        ListNode prev = null;
        while(current!=null){
            ListNode n =current.next ;
            current.next =prev;
            prev = current;
            current = n ; 
        }
        return prev ;
    }
}
