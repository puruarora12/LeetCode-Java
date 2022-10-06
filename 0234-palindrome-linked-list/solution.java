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
    ListNode temp ;
    public boolean isPalindrome(ListNode head) {
        temp =head;
        return check(head);
    }
    
    private boolean check(ListNode head){
        if(head==null)return true;
        boolean ans = check(head.next);
        boolean compare  =  temp.val ==head.val;
        temp=temp.next;
        return ans && compare;
    }
}
