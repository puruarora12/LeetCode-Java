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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> ar = new ArrayList<>();
        for(ListNode head : lists){
            if (head==null) continue;
            while(head!=null){
                ar.add(head.val);
                head=head.next;
            }
        }
        Collections.sort(ar);
       // System.out.println(ar);
        ListNode ans = new ListNode();
        ListNode rt = ans;
        for (int i:ar){
            ans.next= new ListNode(i) ; 
            ans=ans.next;
        }
        return rt.next;
    }
}
