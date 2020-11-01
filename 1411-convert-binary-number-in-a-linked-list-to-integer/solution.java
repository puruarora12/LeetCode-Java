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
    public int getDecimalValue(ListNode head) {
        ListNode n = new ListNode();
        n=head;
        
        String s = ""+n.val;
        while(n.next!=null){
            
            n=n.next;
        
            
            s=s+""+ n.val;
        }
            int decimal=Integer.parseInt(s,2);
            return decimal;
    }
}
