class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int ans = 0;
        int mod =1000000007;
        int[] ar = new int[n];
        Arrays.fill(ar,1);
        while(k-->0){
            for(int i =1;i<n; i++){
                ar[i]=(ar[i]+ar[i-1])%mod;
            }
        }
        return ar[n-1];
            
    }
}
