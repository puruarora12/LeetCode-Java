class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        if (N>7)
            N=N%14;
        if(N==0)
            N=14;
        int ar[][] =new int[15][8];
        ar[0]=cells;
        for (int i = 1; i<15;i++){
            for (int j=1 ; j<7;j++){
                ar[i][j]= ((ar[i-1][j-1] == ar[i-1][j+1]) ? 1 : 0);
                
            }
            ar[i][0]=0;
            ar[i][7]=0;
        }
        
        return ar[N];
    }
}
