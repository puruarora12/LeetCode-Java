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
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = head;
        if(head==null || head.next == null) return head;
        ListNode a =ans;
        int sum =0;
        while(head!=null && head.next!=null){
            ListNode temp = head.next;
            sum=0;
            while(temp.val!=0){
                sum+=temp.val;
                temp=temp.next;
            }
            a.next =new ListNode(sum);
            a=a.next;
            head=temp;
            
        }
        
        return ans.next;
    }
}
