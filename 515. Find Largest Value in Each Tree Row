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
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        checker(root, ans , 0);
        return ans;
        
    }
    
    public void checker(TreeNode root , ArrayList<Integer> ar , int level){
        
        if(root == null) return ;
        
        if(ar.size() == level) ar.add(root.val);
        else ar.set(level , Math.max(ar.get(level), root.val));
        
        checker(root.left  ,ar, level+1);
        checker(root.right  ,ar, level+1);
        
    }
}
