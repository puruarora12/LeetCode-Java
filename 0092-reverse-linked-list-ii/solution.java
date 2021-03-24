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
    static ListNode lastone ; 
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null )
            return null;
        if (left==right)
            return head;
        
        //int count =1;
        ListNode ans = head; 
        ListNode temp =null; 
        for(int i =1 ; i<left ; i++){
            temp =head; 
            head=head.next;
        }//System.out.println("        "+head.val);
        //ListNode temp =head; 
        ListNode reved = rev(head , right-left );
        if (temp!=null)
        temp.next=reved;
        else
            temp  =ans =reved;
        
        for(int i = 0  ; i <right-left+1 ; i++ ){
           // System.out.println(reved.val);
            //reved=reved.next;
            temp=temp.next;
            
        }
        temp.next = lastone;
       return ans;
        
        
    }
    static ListNode rev(ListNode head , int right){
        int count = 0 ;
        ListNode prev = head;
        ListNode next = head ;
        //
       while(count++<=right && head!=null){
            next=head.next;
            head.next = prev;
            prev = head ;
            head = next ;
           lastone = head;
        }
        return prev;
    }
}
