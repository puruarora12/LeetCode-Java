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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            
            int n = queue.size();
            boolean found = false;
            // System.out.println(n +"   "+queue.peek().val);
            while(n-->0){
                TreeNode curr = queue.poll();
                if(!found){
                    ans.add(curr.val);
                    
                    found=true;
                }
                    if(curr.right!=null) queue.offer(curr.right);
                    if(curr.left!=null) queue.offer(curr.left);
                
            }
        
        }
        return ans;    
    }
}
