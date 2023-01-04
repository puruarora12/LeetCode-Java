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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode returnhead = new ListNode(0);
        ListNode returnheader = returnhead;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val) {
                returnhead.next=list1;
                list1=list1.next;
            }else{
                 returnhead.next=list2;
                list2=list2.next;
            }
            returnhead=returnhead.next;
        }
        while(list1!=null){ returnhead.next=list1;  returnhead=returnhead.next; list1=list1.next; }
        while(list2!=null){ returnhead.next=list2;  returnhead=returnhead.next; list2=list2.next; }
        
        return returnheader.next;
    }
}
