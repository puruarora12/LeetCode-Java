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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode n = new ListNode();
        ListNode ans = n;
        
        while(l1!=null && l2!=null){
          //  System.out.println("l1 is "+l1.val+" l2 is "+l2.val);
            if (l1.val<l2.val){
                ListNode temp  = new ListNode(l1.val , l1.next);
                n.next=temp;
                l1=l1.next;
                
            }
            else{
                ListNode temp  = new ListNode(l2.val , l2.next);
                n.next=temp;
                l2=l2.next;
            }
            n=n.next;
            
        }
        
        while(l1!=null){
            ListNode temp  = new ListNode(l1.val , l1.next);
            n.next=temp;
            n=n.next;
            l1=l1.next;
        }
        
        while(l2!=null){
            ListNode temp  = new ListNode(l2.val , l2.next);
            n.next=temp;
            n=n.next;
            l2=l2.next;
        }
        
        return ans.next;
        
    

    }
}
