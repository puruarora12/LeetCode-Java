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
    static int max ;
    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        // if(root ==null) return null;
        check(root);
        return max;

    }

    public static int check(TreeNode root){
        if(root==null) return 0;

        int left = check(root.left);
        int right = check(root.right);

        max = Math.max(max, left+right);
        return Math.max(left, right)+1;
    }
}
