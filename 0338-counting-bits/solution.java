class Solution {
    public int[] countBits(int n) {
        int dp[] = new int[n+1];
		Arrays.fill(dp , -1);
		dp[0] =0 ;
		if(n>=1)dp[1] =1 ;
		if(n>=2)dp[2] =1 ;
		int power = 1;
		for (int i =3 ; i<=n ;i++){
			if(i==Math.pow(2,power+1)) {dp[i]=1; power++;}
			if(dp[i%(int)Math.pow(2, power)]!=-1) dp[i] = dp[i%(int)Math.pow(2, power)]+1;
			
			
			
		}
		return dp;
    }
}
