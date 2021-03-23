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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<ListNode>(); 
        if (head==null)
            return false;
        while(head.next!=null){
            if (!hs.contains(head)){
                hs.add(head);
                head=head.next;
            }
            else
                return true;
        }
        return false;
    }
}
