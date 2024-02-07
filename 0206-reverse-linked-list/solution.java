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
        if(head==null || head.next==null) return head;
        ListNode h = head;
       // ListNode temp ;
        ListNode ans ;
        ListNode prev=null;
        ListNode curr = head;
        
        while( curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr =temp;
            //prev = curr
        }
        return prev;
    }
}
