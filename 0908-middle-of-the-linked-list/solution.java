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
    public ListNode middleNode(ListNode head) {
        ListNode n =head ;
        ListNode nn =head; 
        while(n.next!=null && nn!=null &&nn.next!=null ){
            n=n.next;
            nn=nn.next.next;
        }
        return n;
    }
}
