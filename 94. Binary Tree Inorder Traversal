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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ar = new ArrayList<Integer>();
        check(root, ar);
        return ar;
        
    }
    
    private void check(TreeNode root, List<Integer> ar){
        if(root==null) return;
        check(root.left,ar );
        ar.add(root.val);
        check(root.right ,ar);
        
    }
}
