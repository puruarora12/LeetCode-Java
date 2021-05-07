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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        //TreeNode temp1 = root1;
        //TreeNode temp2 = root2;
        TreeNode ans = new TreeNode();
        if (root1 !=null) ans.val += root1.val;
        if (root2 !=null) ans.val += root2.val;
        if (root1==null && root2==null) return null;
        else if (root1 !=null && root2!=null){
            if(root1.left!=null || root2.left!=null ){
            root1.left = root1.left!=null ? root1.left : new TreeNode(0);
            root2.left = root2.left!=null ? root2.left : new TreeNode(0);
            }else
                ans.left=null;
            
            if(root1.right!=null || root2.right!=null ){
            root1.right = root1.right!=null ? root1.right : new TreeNode(0);
            root2.right = root2.right!=null ? root2.right : new TreeNode(0);
            }else ans.right=null;
            
            if (root1.left!=null && root2.left!=null)
            ans.left = mergeTrees(root1.left  , root2.left);
            if (root1.right!=null && root2.right!=null)
            ans.right = mergeTrees(root1.right , root2.right);
            }
        else{
            return root1==null ?  root2 : root1;
        }
        return ans ;
    }
}
