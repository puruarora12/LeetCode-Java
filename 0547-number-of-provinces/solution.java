class Solution {
    public int findCircleNum(int[][] isConnected) {
       int count = 0;
       int n = isConnected.length;
       int[] provinces = new int[n];
       for(int i =0 ; i<n; i++)provinces[i]=i;

       for(int i = 0 ; i<n ; i++){
            for(int j =0 ; j <n ; j++){
                if( i!=j && isConnected[i][j]==1){
                    int u = find(provinces , i);
                    int v = find(provinces, j);
                    if(u!=v) union(provinces, u,v);
                }    
            }
       }

       for(int i = 0 ; i<n; i++)if(provinces[i]==i)count++;
       return count;


    }

    private int find(int[] parent, int index){
        while(parent[index]!=index) index =find(parent, parent[index]);
        return index;
    }

    private void union(int[] parent, int u, int v){
        if(u<v)parent[v]=u;
        else parent[u]=v;
    }
}
