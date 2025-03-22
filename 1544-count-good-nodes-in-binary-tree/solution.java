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
    public int goodNodes(TreeNode root) {
        int count =0;
        if(root==null )return count;

        count =dfs(root ,root.val);
        return count;
    }

    private int dfs(TreeNode root, int value){
        int counter=0;
        if(root.val>=value){
        counter=1;
        }
        if(root.left!=null) counter+=dfs(root.left, Math.max(value, root.val) );
        if(root.right!=null) counter+=dfs(root.right, Math.max(value, root.val) );
        return counter; 
    }

}
