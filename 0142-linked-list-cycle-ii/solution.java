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
        if (head== null)
            return null;
        ListNode fptr = head;
        ListNode sptr = head;
        boolean  b= true;
        while(fptr !=null && fptr.next!=null ){
            if (b)
            fptr=fptr.next.next;
            else
                fptr = fptr.next;
            
            sptr=sptr.next;
            if (sptr == fptr){
                    b=false;
                break;
            }
                       
        }
        if (b)
            return null;
        
            sptr =head;
            while(sptr !=fptr){
              
                    sptr=sptr.next;
                    fptr = fptr.next;
                
                
            }
        
        return sptr;
    
}
}
