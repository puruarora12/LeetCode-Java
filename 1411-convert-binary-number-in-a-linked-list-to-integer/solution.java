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
    public int getDecimalValue(ListNode head) {
        int num = 0;
        boolean first =false;
        while(head!=null){
            if(head.val ==1 && first==false){
                num =1 ;
                first = true;
            }
            else if(head.val==0) num*=2;
            else num=num*2+1;
            head=head.next;
        }
        return num;
    }
}
