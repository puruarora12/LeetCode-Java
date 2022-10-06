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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return check(root.left, root.right);
    }
    
    private boolean check(TreeNode left , TreeNode right){
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        return (left.val==right.val)&&(check(left.left , right.right) && check(right.left , left.right)); 
        
    }
}
