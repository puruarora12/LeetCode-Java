class Solution {
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        int[] parent= new int[n];
        for(int i =0 ; i<n ; i++)parent[i]=i;
        int[] cost = new int[n];
        Arrays.fill(cost,-1);

        for(int[] edge:edges){
            int start =edge[0], end = edge[1] , weight= edge[2];
            int startRoot = find(parent, start);
            int endRoot = find(parent, end);

            cost[endRoot]&=weight;

            if(startRoot!=endRoot){
                cost[endRoot]&=cost[startRoot];
                parent[startRoot]=endRoot;
            }


        }

        int results[] = new int[query.length];
        for(int i =0 ; i<query.length; i++){
            int start= query[i][0] ,  end = query[i][1];

            int startRoot = find(parent, start);
            int endRoot = find(parent, end);

            if(startRoot!=endRoot)results[i]=-1;
            else{
                if(start==end) results[i]=0;
                else{
                    results[i]=cost[find(parent, start)];
                }
            }
        
        }
        return results;
        
    }

    private int find(int[] parent, int node){
      if(parent[node]!=node)parent[node] =find(parent, parent[node]);
      return parent[node];
    }
    

}
