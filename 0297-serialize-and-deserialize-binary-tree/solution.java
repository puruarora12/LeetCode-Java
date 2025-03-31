/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String data = "";
        if(root==null)return data;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            while(n-->0){
                TreeNode curr = q.poll();
                if(curr==null)data+="null/";
                else{
                    data+=curr.val+"/";
                    // if(curr.left!=null || curr.right!=null ){
                        q.offer(curr.left);
                        q.offer(curr.right);
                    // }
                }
            }
        }
        // System.out.println(data);
        return data;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0)return null;
        String nodes[] = data.split("/");
        Queue<TreeNode> q = new LinkedList<>();
        int index = 1;
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        q.offer(root);
        while(index<nodes.length){
            int nodesize = q.size();
            while(nodesize-->0){
                
                TreeNode curr=q.poll();
                TreeNode left =new TreeNode();
                TreeNode right = new TreeNode();
                if(index<nodes.length){
                    // System.out.println("index "+nodes[index]+"  index+1 "+nodes[index+1]);
                    if(nodes[index].equals("null"))
                        left = null;
                    else{
                        left= new TreeNode (Integer.parseInt(nodes[index]));
                        q.offer(left);
                    }
                }
                if(index+1<nodes.length){
                    if(nodes[index+1].equals("null"))
                        right = null;
                    else {
                        right= new TreeNode (Integer.parseInt(nodes[index+1]));
                        q.offer(right);
                    }
                }
                curr.left =left ;
                curr.right=right;
                index +=2;
                
            }
        }
        return root;        
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
