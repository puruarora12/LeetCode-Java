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
    static HashMap<Integer, Integer> map;
    static int preorderindex ;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for(int i = 0 ; i<inorder.length ; i++)map.put(inorder[i],i);
        preorderindex =0 ;
        return makeTree(preorder ,inorder, 0 , inorder.length-1);
    }

    public static TreeNode makeTree(int[] pre ,int[] in,  int start, int end){
        if(start>end) return null;

        TreeNode root = new TreeNode(pre[preorderindex]);
        preorderindex++;
        int mid = map.get(root.val);
        root.left = makeTree(pre, in, start,mid -1);
        root.right = makeTree(pre, in, mid+1 , end);
        return root;
    }


}
