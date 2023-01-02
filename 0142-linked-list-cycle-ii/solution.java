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
     /*   HashSet<ListNode> set = new HashSet<>();
        ListNode temp = head;
        while(temp!=null){
            if(set.contains(temp)) return temp;
            set.add(temp);
            temp=temp.next;
        }
        return null;  */
        
        ListNode fast =head;
        ListNode slow =head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return findNode(head , fast);
        }
        return null;
        
        
        
    }
    private ListNode findNode(ListNode head, ListNode fast){
        while(head!=fast){
            fast=fast.next;
            head=head.next;
        }
        return head;
    }
}
