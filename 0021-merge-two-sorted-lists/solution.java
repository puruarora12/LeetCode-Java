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
        ListNode head= new ListNode();
        ListNode temp =head ;
        while(list1!=null && list2!=null){
           // System.out.println("Before lista "+list1.val+"  listb "+list2.val +"  head "+head.val);
            ListNode demo =new ListNode() ;
            if(list1.val<list2.val) { 
              //  System.out.println("in 1st if"); 
                demo=list1;  
                list1=list1.next; 
            }else if(list1.val>=list2.val) { 
                //System.out.println("in 2nd if"); 
                demo=list2; 
                list2=list2.next; 
            }
            head.next=demo;
            head =head.next;
           // System.out.println("After head "+head.val);
           // System.out.println();
        }
        if(list1!=null) head.next =list1;
        if(list2!=null) head.next =list2;
        
        return temp.next;
    }
}
