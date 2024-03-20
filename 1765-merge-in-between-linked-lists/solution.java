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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int dif = b-a;
        ListNode slow = list1;
        ListNode fast = list1;
        while(dif-->0) fast = fast.next;
        
        while(a-->1){ slow = slow.next ; fast=fast.next;}
        fast=fast.next;
        
        //System.out.println(slow.val+"   "+fast.val);
        
        slow.next =list2;
        ListNode l2 = list2;
        while(l2.next!=null) l2=l2.next;
        l2.next =fast.next;
        return list1;
    }
}
