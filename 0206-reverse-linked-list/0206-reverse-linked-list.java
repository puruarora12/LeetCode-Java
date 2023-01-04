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
        ListNode temp =head;
        ListNode prev= null;
        ListNode curr =head;
        
        while(curr!=null){
            temp=curr.next;
            curr.next =prev;
            prev =curr;
            curr=temp;
            //System.out.println("curr "+curr.val);
            //System.out.println("prev "+ prev.val);
            
        }
        return prev;
    }
}