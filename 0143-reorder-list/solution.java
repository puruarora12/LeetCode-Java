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
    public void reorderList(ListNode head) {
        ArrayList<ListNode> ar =  new ArrayList<>();
        ListNode ans = head;
        ListNode ret = head;
        while(head!=null){
            ar.add(head);
            head=head.next;
        }
        int left  =1 ;
        int right =ar.size()-1;
        boolean c = true;
        while(left<=right){
         //System.out.println(ans.val);
            if(c){
                ans.next = ar.get(right);
                right--;
                c =false;
            }else{
                ans.next =ar.get(left);
                left++;
                c=true;
            }
            ans=ans.next;
            //System.out.println("ans val after "+ans.val+"  left "+left+"  right "+right);
            
            
        }
        ans.next =null;
        //return ret;
    }
}
