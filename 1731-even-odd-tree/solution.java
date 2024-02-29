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
    static Queue<TreeNode> q;
    static Queue<Integer> ar;
    public boolean isEvenOddTree(TreeNode root) {
        int depth  =0;
        q= new LinkedList<TreeNode>();
        ar= new LinkedList<Integer>();
        if(root!=null){
            q.add(root);
            ar.add(0);
                      }
        return check( depth);
        
    }
    
    public static boolean check( int depth){
        //int d = ar.peek();
        int lval =0;
        int d =depth;
        if(d%2==0) lval=Integer.MIN_VALUE;
        else lval=Integer.MAX_VALUE;
        //System.out.println(" before while "+q.peek().val+"     "+d);
        while(!q.isEmpty() && ar.peek()==d ){
            TreeNode root = q.poll();
            ar.poll();
            if(d%2==0 && (root.val<=lval || root.val%2==0) ){ 
                //System.out.println(d+" even  "+root.val+"     "+root.val%2+"     "+lval); 
                return false;
            }
            else if(d%2!=0 && (root.val>=lval || root.val%2!=0 )) {
                //System.out.println(d+"  odd  "+root.val+"     "+root.val%2+"     "+lval);
                return false;
            }
            else {
                lval=root.val;
                if(root.left!=null){ q.add(root.left); ar.add(depth+1);}
                if(root.right!=null){q.add(root.right); ar.add(depth+1);}
                
                
                //System.out.println("adding to: q peek "+q.peek().val+" ar peek "+ar.peek()+"   "+" lval "+lval);
                
            }
            
            
            
            //depth++;
            
            
            
        }
        if(!q.isEmpty())return check(d+1);
            else return true;        
    }
}
