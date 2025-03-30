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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null  || left==right) return head;

        ListNode toReturn = head;
        ListNode prev = null;
        ListNode next = null;
        int diff= right-left;
        while(left-->1 && head!=null){
            prev= head;
            head = head.next;
            
        }
        ListNode leftNode = head;
        // System.out.println(leftNode.val);
        while(diff-->0 && head!=null){
            // prev= head;
            head = head.next;
            
        }
        
        ListNode rightNode = head;
        // System.out.println(rightNode.val);
        next = head.next;
        rightNode.next = null;
        
        // System.out.println(leftNode.val +"     "+rightNode.val);
        if(prev!=null)
            prev.next = reverse(leftNode, rightNode);
        else
            prev=toReturn=reverse(leftNode,rightNode);
        while(prev.next!=null) prev =prev.next;
        prev.next=  next;
        return toReturn;


    }
    private ListNode reverse(ListNode left , ListNode right){
        ListNode prev = null;
    
        while(left!=null){
            ListNode temp = left.next ;
            left.next = prev;
            prev= left;
            left =temp;
        }
        
        return right;
    }
}
