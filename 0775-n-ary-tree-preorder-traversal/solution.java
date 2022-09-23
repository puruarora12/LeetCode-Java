/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> ar = new ArrayList<>();
        check(root , ar);
        return ar;    
    }
    
    private void check(Node root, ArrayList<Integer> ar){
        if(root==null) return;
        ar.add(root.val);
        for(Node i : root.children) check( i  ,ar);
    }
}
