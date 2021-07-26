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
    public TreeNode sortedArrayToBST(int[] nums) {
        int mid = (nums.length-1)/2;
        System.out.println(mid );
        TreeNode root ;
        if(nums.length>=3) {
            root = new TreeNode(nums[mid] , findnode(0,mid-1,nums) , findnode(mid+1 , nums.length-1 , nums)); 
            
        }else{
         if(nums.length==1) root = new TreeNode(nums[0]);
            else {
               root = new TreeNode(nums[0]);
                if(nums[1]>nums[0]) root.right = new TreeNode(nums[1]);
                else root.left = new TreeNode(nums[1]);
                }
        }
        return root;
    }
    
    public TreeNode findnode(int start, int end, int nums[]){
        System.out.println(start +"  "+end);
        if (start<0 || end>=nums.length) return null;
        if(end-start==1) return new TreeNode(nums[start] , null, new TreeNode(nums[end])); 
        if(start==end) return new TreeNode(nums[start]);
        int mid = start+(end-start)/2;
        TreeNode root  = new TreeNode(nums[mid],findnode(start,mid-1,nums) , findnode(mid+1 , end , nums));
        return root;
    }
    
    
}
