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
    public ListNode reverseList(ListNode head) {
        if (head==null)
            return null;
        ArrayList<Integer> ar = new ArrayList<>();
        while(head.next!=null){
            ar.add(head.val);
            head = head.next;
            
        }
        ar.add(head.val);
        Collections.reverse(ar);
        for(int i : ar)
            System.out.println(i);
        ListNode rev = new ListNode();
        ListNode revhead = rev;
        for (int i : ar){
        rev.next=new ListNode(i);  
        rev =rev.next ;
        }
        return revhead.next;
    }
}
