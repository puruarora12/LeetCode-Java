class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0]=0;
        int count = 1 ;
        
        
        for(int i =1 ; i <=n ; i++){
            if (i==1) {
                ans[i]=1;
            continue;
            }
            if(i%count==0){ 
                ans[i]=1;
                count*=2;
            }else{
                ans[i]= ans[i%count]+1;
            }
        }
        return ans;
    }
}
