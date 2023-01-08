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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0 ;
        ListNode temp = head;
        
        while(temp!=null) { length++ ; temp = temp.next; }
        
        int parts  = length/k;
        int freq = length%k;
        
        ListNode[] ls = new ListNode[k];
        
        int pos = 0 ;
        while(pos<k){
            ListNode temp2 =head ; 
            ls[pos] = head;
            for(int i = 0 ; i<parts  ; i++){ temp2 = head; head=head.next ; } 
            if(freq!=0){freq--; temp2 = head; head=head.next ;}
            if(temp2!=null && temp2.next!=null) temp2.next=null;
            pos++;
            
        }
        
        return ls;
    }
}
