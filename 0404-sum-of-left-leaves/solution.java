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
    public int sumOfLeftLeaves(TreeNode roots) {
         int sum = 0 ;
        //TreeNode  base = root;
        Stack<TreeNode> q = new Stack<>();
        q.push(roots);
        TreeNode prev =null;
        while(!q.isEmpty()){
            TreeNode root = q.pop();
            //System.out.println(root.val);
            if(root.right!=null) q.push(root.right);
            if(root.left!=null) q.push(root.left);
            
            if(root.right==null && root.left==null &&prev!=null && root == prev.left) sum+=root.val;
            if(root.right==null && root.left==null) continue;
                
            prev = root;    
        }
        return sum;
}
}
