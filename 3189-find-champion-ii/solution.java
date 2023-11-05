class Solution {
    public int findChampion(int n, int[][] edges) {
        
        int[][] mat = new int[n][n];
        
        for (int[] i : edges){
            mat[i[0]][i[1]]=1;
            mat[i[1]][i[0]]=-1;
        }
        
        //for(int[] i:mat){
        //    for(int  j:i) System.out.print(j+" ");
        //    System.out.println();
       // }
        int[]  score = new int[n];
        Arrays.fill(score,1);
        
        for(int j = 0 ; j<n ; j++){
            for(int i = 0 ; i<n ; i++){
                if (mat[i][j]==-1) score[i]=0;
            }
                }
        //for(int i: score) System.out.print(i+" ");
        //System.out.println();
        if(IntStream.of(score).sum()>1) return -1;
        for(int i = 0 ; i<n ; i++) if(score[i]==1) return i;
        return -1;
    }
}
