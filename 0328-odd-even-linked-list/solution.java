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
    public ListNode oddEvenList(ListNode head) {
        ListNode ans = new ListNode();
        ListNode ans2 = new ListNode();
        ListNode ret1 = ans;
        ListNode ret2 = ans2;
        
        if (head==null) return null;
        
        while(head!=null && head.next!=null){
            ans.next=head;  /// ans.next<- 1 , 3 ,5
            ans=ans.next;   /// ans<- 1 ,3 ,5
            ListNode temp = head.next;   /// temp<- 2 ,4
            head=head.next.next; /// head<- 3 ,5
            ans2.next=temp; /// ans2.next<- 2,4
            ans2=ans2.next; /// ans<- 2,4
        }
        if (head!=null && head.next==null){
            ans.next=head;
            ans=ans.next; 
            ans2.next=null;
        }
        
        
       ans.next=ret2.next;
        
        return ret1.next;
        
    }
}
