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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> pre = Arrays.stream(preorder).boxed().collect(Collectors.toList());
        List<Integer> in = Arrays.stream(inorder).boxed().collect(Collectors.toList());

        return makeTree(pre ,in);
    }

    public static TreeNode makeTree(List<Integer> pre , List<Integer> in){
        if(pre.size()==0 )return null;
        if(in.size()==0 )return null;

        TreeNode root = new TreeNode(pre.get(0));
        
        int mid = in.indexOf(pre.get(0));
        
        if (mid>=0){
        
        root.left = makeTree(pre.subList(1 , mid+1 ) , in.subList(0 , mid+1));
        
        }if(mid>=0){
        root.right = makeTree(pre.subList(mid+1 , pre.size())  , in.subList( mid+1, in.size()));
        }return root;
    }


}
