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
    public boolean isPalindrome(ListNode head) {
        ListNode slow  =head;
        ListNode fast =head;
        Stack<ListNode> stack = new Stack<>();
        if(head==null || head.next==null ) return true;
            
        while(fast!=null && fast.next!=null){
            stack.push(slow);
            slow = slow.next;
            fast = fast.next.next;
        }
        Stack<ListNode> s1 =(Stack<ListNode>)stack.clone();
        //Stack<ListNode> s2 =(Stack<ListNode>)stack.clone();
       return (checkPalindrome(slow, s1) ||  checkPalindrome(slow.next ,stack)); 
    }
    
    public static boolean checkPalindrome(ListNode slow , Stack<ListNode> stack ){
        //if(flag==0) stack.pop(); 
        while(slow!=null && stack.size()!=0){
           // System.out.println(slow.val +"        "+stack.peek().val);
           if(slow.val!=stack.pop().val) return false;
        slow=slow.next;
        }
        
       if(slow==null && stack.size()==0) return true; else return false;
    }
}