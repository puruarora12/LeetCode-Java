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
        bfs(root, 0, true) ;
        return toreturn.val;
    }
    
    public static void bfs(TreeNode root, int depth, boolean isleft){
        Queue<TreeNode> q  = new LinkedList<>();
        //TreeNode toreturn=root;
        //System.out.println(root.val+"    "+isleft+"    "+depth);
        if(root.left==null && root.right==null)  if(depth>level ){level=depth; toreturn= root;}
        if(root.left!=null) bfs(root.left, depth+1, true);
        if(root.right!=null) bfs(root.right, depth+1, false);
        //return toreturn;
        //else return Math.max(bfs(root.left, depth+1, true) , bfs(root.right, depth+1, false));
    }
}
