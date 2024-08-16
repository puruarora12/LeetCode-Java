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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode ans = head;
       
        if(head==null || head.next==null) return head;
        
        
        while(head.next!=null){
             ListNode first = head;
            ListNode second = head.next;
            ListNode temp= new ListNode(gcd(first.val , second.val));
            first.next= temp;
            temp.next = second;
            head= second;
        }
        
        
        
        return ans;
    }
    static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b); 
    }
}
