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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode prev = new ListNode(0), curr = prev;
        prev.next =head;
        int prefix =0;
        while(curr!=null){
            
            prefix +=curr.val;
            //System.out.println("prefix "+prefix+"  curr.val "+curr.val);
            if(map.containsKey(prefix)){
                
                ListNode toDelete = map.get(prefix);
                while(toDelete!=curr){
                    toDelete=toDelete.next;
                    prefix+=toDelete.val;
                    if(toDelete!=curr) map.remove(prefix);
                }
                map.get(prefix).next = curr.next;
                //System.out.println("prefix for present already val "+prefix);
            }else map.put(prefix,curr);
            curr= curr.next;
        }
        return prev.next;
    }
}
