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
    int max =0 ;
    public int longestZigZag(TreeNode root) {
        if(root==null) return 0;
        dfs(root.left , 0 , false);
        dfs(root.right, 0,true);
        return max;
    }
    private void dfs(TreeNode root, int len, boolean direction){
        max =Math.max(len,max);
        if(root==null)return;
        dfs(root.left, direction? len+1: 0 , false);
        dfs(root.right, direction?  0:len+1 , true);
    }
}
