/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
      ListNode temp = node.next ;
        while(temp.next!=null){
            node.val = temp.val;
            temp=temp.next;
            node=node.next;
        }
        node.val = temp.val;
        node.next= null;
    }
}