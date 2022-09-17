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
        if(root==null) return ans;
        Queue<TreeNode> q =new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);
        int max = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp!=null) {
                max = Math.max(max, temp.val);
            if (temp.left!=null) q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            }else{
                ans.add(max);
                max=Integer.MIN_VALUE;
                if(!q.isEmpty()) q.add(null);
            }
        }
        return ans;
    }
}
