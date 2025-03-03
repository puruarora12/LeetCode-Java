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
    // HashMap<TreeNode, TreeNode> map ;
    List<Integer> ans;
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ans= new ArrayList<>();
         HashMap<TreeNode, TreeNode> map = new HashMap<>();
        List<TreeNode> visited= new ArrayList<>();
        buildTree(root,map);
        findNode(target, k, visited,map);
        return ans;
    }
    private void findNode(TreeNode root, int k,List<TreeNode> visited, HashMap<TreeNode, TreeNode> map){
        visited.add(root);
        // System.out.println("node is "+root.val+" k is "+k);
        if(k==0) { 
            // System.out.println("This node is added "+root.val+" k is "+k);
            ans.add(root.val);
            }
        // if(k<0) return;
        if(root.left!=null && !visited.contains(root.left)) { 
            // System.out.println("processing left");
            // visited.add(root.left);
            findNode(root.left, k-1,visited,map); 
        }
        if(root.right!=null && !visited.contains(root.right)){ 
            // System.out.println("processing right");
            // visited.add(root.right);
            findNode(root.right, k-1,visited,map);
        }
        if(map.containsKey(root) && !visited.contains(map.get(root))){
            //  System.out.println("processing parent");
            //  visited.add(map.get(root));
             findNode(map.get(root), k-1,visited,map);
        }
        return;

    }  



    private void buildTree(TreeNode root, HashMap<TreeNode, TreeNode> map){
        if(root.left!=null){
            map.put(root.left,root);
            buildTree(root.left,map);
        }
        if(root.right!=null){
            map.put(root.right,root);
            buildTree(root.right,map);
        }
        // System.out.println(map);
    }


}
