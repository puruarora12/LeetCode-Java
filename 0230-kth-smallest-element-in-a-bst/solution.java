/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        if(root==null) return 0;
        traverse(root , q);
        int ans =0;
        while(k>0) {
            if(q.peek()!=-1)k--;
            ans = q.poll();
        }
        return ans;
    }
    
    
    private void traverse(TreeNode root , Queue<Integer> q){
            q.offer(root.val);
        if(root.left==null && root.right==null) {
            //q.offer(0);
            return;
        }
        else if(root.left!=null && root.right==null){
            q.offer(-1);
            traverse(root.left , q);
        }
        else if(root.right!=null && root.left==null) {
            q.offer(-1);
            //q.offer(root.val)
            traverse(root.right , q);
        }
        else {
            traverse(root.left ,q);
            traverse(root.right ,q);
        }
    }
}
