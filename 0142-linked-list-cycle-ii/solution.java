/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode n1 = head;
        ListNode n2 = head;
        boolean loop = true;
        while(n1!=null && n2!=null && n2.next!=null){
            n1=n1.next;
            n2=n2.next.next;
            if(n1==n2){   
               loop =false;
               break;
            }
        }
        if(loop) return null;
        
        while(head!=n2){
            head=head.next;
            n2=n2.next;
        }
        return head;
    }
}
