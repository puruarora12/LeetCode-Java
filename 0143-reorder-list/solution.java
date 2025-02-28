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
    public void reorderList(ListNode head) {
        ListNode ans = head;
        if(ans !=null || ans.next!=null){
            ListNode slow =head ,  fast =head;
            while(fast!=null && fast.next!=null) {
                slow=slow.next ;
                fast=fast.next.next;
            }
            ListNode revhead = reverse(slow);
            //merge reversed and start list
            ListNode temp =revhead;

            while(revhead!=null && revhead.next!=null){
                ListNode temp1 = head.next;
                ListNode temp2 = revhead.next;

                head.next = revhead;
                revhead.next = temp1;
                temp1= temp1.next;
                // temp2=temp2.next;
                head =revhead.next;
                revhead = temp2;
            }
            
           
        
        // return ans;
        }
    }

    public static ListNode reverse(ListNode head){
        ListNode prev= null;
        // ListNode temp =head;
        while(head!=null){
            ListNode tem =head.next;
            head.next =prev;
            
            prev =head;
            head=tem;
        }
        return prev;
    }
}
