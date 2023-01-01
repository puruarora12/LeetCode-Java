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
        ListNode fast = head; 
        ListNode slow = head;
        while(n>0 ) {n--; fast = fast.next; 
        //System.out.println("value of n is "+n +" fast is at "+fast.val);
        }
        
        while(fast!=null && fast.next!=null) {
            
            slow = slow.next;
            fast = fast.next ;
            //System.out.println("slow "+slow.val+"  fast "+fast.val);
        }
        //System.out.println("slow "+slow.val+"  fast "+fast.val);
        if(fast==null && slow==head) return head.next;
        else if(slow==null || slow.next==null) return null;
        else slow.next = slow.next.next;
        
        return head;
    }
}
