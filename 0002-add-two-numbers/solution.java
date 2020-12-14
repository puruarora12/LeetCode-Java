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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode n = dummy;
        
        int carry = 0;
        while(l1!=null || l2!= null){
            int l1val = (l1==null) ? 0 : l1.val;
            int l2val = (l2==null) ? 0 : l2.val;
            int sum=(l1val + l2val + carry)%10;
            carry = (l1val + l2val + carry)/10;
            ListNode l3 = new ListNode(sum);
            
            n.next=l3; 
            if (l1!=null) l1= l1.next;
            if (l2!=null) l2= l2.next;
            n=n.next;
            
                

            
        }
        if (carry!=0){
            n.next = new ListNode(carry);
            n=n.next;
        }
            
        return dummy.next;
    }
}
