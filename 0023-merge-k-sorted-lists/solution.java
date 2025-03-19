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
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val-b.val);
        for(ListNode i :lists)if(i!=null)pq.offer(i);
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        while(pq.size()!=0){
            ListNode small = pq.poll();
            if(small.next!=null)pq.offer(small.next);
            ans.next= small;
            ans = ans.next;
        }
        return dummy.next;
    }
}
