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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next==null)
            return null;
        else{
            ListNode temp = new ListNode();
            ListNode temp2 = new ListNode();
            temp = temp2=head ;
            
            int count =1;
            while(count<=n){
                temp2 =temp2.next;
                count++;
            }
            
            while(temp2!=null &&temp2.next!=null){
                temp = temp.next;
                temp2=temp2.next;
                
            }
            if (temp ==head && temp2==null)
                head=head.next;
            
       //    System.out.println("temp2 is "+temp2.val + "  temp is "
         //                     + temp.val);
            if (temp.next.next!=null)
                temp.next = temp.next.next;
            else
                temp.next = null;
            
            
        //    System.out.println(temp.val);
                
            return head;
        }
    }
}
