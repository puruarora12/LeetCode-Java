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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ar = new ArrayList<List<Integer>>();
        if(root==null) return ar;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        q.add(root);
        q.add(null);
            ArrayList<Integer> z = new ArrayList<>() ;
        while(!q.isEmpty()){
                TreeNode temp =  q.poll();
            if(temp!=null){
                z.add(temp.val);
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            else{
                
            ArrayList<Integer> z_ = new ArrayList<>(z) ;
                ar.add(z_);
                z.clear();
            if(!q.isEmpty())q.add(null);
            }
            
            
                
        }
        return ar;
    }
}
