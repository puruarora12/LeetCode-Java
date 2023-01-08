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
       /*
        
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
        return (checkPalindrome(slow, s1) ||  checkPalindrome(slow.next ,stack)); 
    */
        
        ListNode slow = head;
        Queue<ListNode> q = new LinkedList<>();
        Stack<ListNode> s = new Stack<>();
        
        if(head==null || head.next==null) return true;
        
        while(head!=null){
            s.push(head);
            q.add(head);
            head=head.next;
        }
        int n = s.size();
        while(q.size()!=0 && s.size()!=0 && s.pop().val==q.poll().val && s.size()>=n/2){continue;}
        
        if(q.size()==n/2-1 && s.size()==n/2-1) return true; else return false;
        
        
        
    }
    
   /* public static boolean checkPalindrome(ListNode slow , Stack<ListNode> stack ){
       while(slow!=null && stack.size()!=0){
            if(slow.val!=stack.pop().val) return false;
        slow=slow.next;
        }
        
       if(slow==null && stack.size()==0) return true; else return false;
    } */
}
