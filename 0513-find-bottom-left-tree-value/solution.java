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
    static int level;
    static TreeNode toreturn;
    public int findBottomLeftValue(TreeNode root) {
       
        level=0;
        toreturn=root;
        bfs(root, 0) ;
        return toreturn.val;
    }
    
    public static void bfs(TreeNode root, int depth){
        if(root.left==null && root.right==null)  if(depth>level ){level=depth; toreturn= root;}
        if(root.left!=null) bfs(root.left, depth+1);
        if(root.right!=null) bfs(root.right, depth+1);
       
    }
}
