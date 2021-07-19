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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode root = new ListNode (0 , head);
        ListNode curr =head;
        ListNode prev = root;
        
        while(curr!=null){
            ListNode tail = curr;
            int index = 0 ;
            while(curr!=null && index<k){
                curr=curr.next;
                index++;
            } 
                
            if(index!=k)
                prev.next=tail;
            else{
            prev.next = reverseLinkedList(tail, k);
            prev=tail;
            }
        }
        return root.next;
        
    }
    
    public ListNode reverseLinkedList(ListNode head , int k ){
        ListNode prev = null; 
        ListNode next = null;
        ListNode curr = head;
        while(curr!=null && k-->0){
            next= curr.next;
            curr.next =prev;
            prev=curr;
            curr=next;    
            
        }
        head= prev;
        return head;
    }
}
