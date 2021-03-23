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
        if (head == null)
            return null;
        HashSet<ListNode> hs = new HashSet<ListNode>();
        //ListNode n =head;
        
        while(head!=null){
            if (hs.contains(head))
                return head;
            else{
                hs.add(head);
                head=head.next;
            }
                
        }
        return null;
            
        
        
    }
}
