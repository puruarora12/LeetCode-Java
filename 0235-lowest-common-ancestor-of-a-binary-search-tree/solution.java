/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        ArrayList<TreeNode> arp = new ArrayList<TreeNode>();
        ArrayList<TreeNode> arq = new ArrayList<TreeNode>();
        arp.add(root);
        arq.add(root);
        findNode(root, p ,arp) ; 
        findNode(root, q, arq) ;
        return checkNode(arp, arq);
    }
    
    private void findNode(TreeNode root ,TreeNode target , ArrayList<TreeNode> ar){
        if(root==target) return;
        if(target.val>root.val) {ar.add(root.right) ;  findNode(root.right , target , ar) ;}
        if(target.val<root.val) {ar.add(root.left) ;  findNode(root.left , target , ar) ;}
        
    }
    
    private TreeNode checkNode(ArrayList<TreeNode> left , ArrayList<TreeNode> right){
        int i = 0 ; 
        while(i<left.size()  && i<right.size() && left.get(i)==right.get(i)) i++;
        return left.get(i-1);
    }
}
