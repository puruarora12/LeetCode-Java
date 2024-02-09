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
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        int depth = 1;
        return check(root, depth);
    }
    public static int check(TreeNode root, int depth){
        if(root.left==null && root.right ==null ) return depth;
        else if(root.left==null) return check(root.right, depth+1);
        else if (root.right==null) return check(root.left , depth+1);
        else return Math.max(check(root.left , depth+1 ) ,check(root.right , depth+1));
    }
}
