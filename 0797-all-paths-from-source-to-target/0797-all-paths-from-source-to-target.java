class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
      List<List<Integer>>  ans = new ArrayList<>();
        List<Integer> ar = new ArrayList<>();
        ar.add(0);
        findPath( 0 , graph, ans , ar );
        return ans ;
    }
    
    private void findPath(int i ,  int[][] graph , List<List<Integer>> ans  , List<Integer> ar){
        if(i==graph.length-1){
            ans.add(new ArrayList<>(ar));
            return;
        }
        
        for(int index2 :graph[i] ){
            ar.add(index2);
            findPath(  index2 ,graph , ans , ar);
            ar.remove(ar.size()-1);
        }
        
    }
}