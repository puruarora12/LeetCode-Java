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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode ans = new ListNode();
        ans.next=head;
        ListNode slow= head;
        ListNode fast= head;
        while(n-->0){
            fast =fast.next;
       } 
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        //if(fast==null) System.out.println("fast is null"+slow.val);else System.out.println(fast.val);
        if(fast==null && slow==head ) ans.next= slow.next;
        else slow.next=slow.next.next;
    return ans.next;
    }
}
