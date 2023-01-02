/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        /*ListNode fast = head;
        ListNode slow = head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }*/
    
    HashSet<ListNode> map = new HashSet<>();
    ListNode temp =head;
    while(temp!=null ){
        if(map.contains(temp)) return true;
        map.add(temp);
        temp=temp.next;
    }
    return false;
}
}
