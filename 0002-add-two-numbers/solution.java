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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0 ;
        ListNode ans = l1;
        ListNode prev1 = l1;
        ListNode prev2= l2;
        while(l1!=null && l2!=null){
            l1.val = l1.val+l2.val+carry;
            if(l1.val>9){
                l1.val%=10;
                carry=1;
            }else carry=0;
            prev1= l1;
            prev2=l2;
            l2=l2.next;
            l1=l1.next;
        }
        while(l1!=null ){
            l1.val = l1.val+carry;
            if(l1.val>9){
                l1.val%=10;
                carry=1;
            }else carry=0;
            prev1=l1;
            l1=l1.next;
        }
        if(l2!=null)prev1.next =l2;
        while(l2!=null ){
            l2.val = l2.val+carry;
            if(l2.val>9){
                l2.val%=10;
                carry=1;
            }else carry=0;
            prev2=l2;
            l2=l2.next;
        }
        ListNode last = new ListNode(1);
        if(carry==1 ) 
            if(prev1.next==null)prev1.next=last;
            else prev2.next=last; //type here
        return ans;
    }
}
