class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] ar = new boolean[right+1];
        Arrays.fill(ar, true);
        ar[0]=false;
        ar[1]=false;
        for(int i = 2 ; i*i<=right ; i++){
            // System.out.println("left "+left+ " right "+right+"  i "+ i+ " ar[i-left] "+(i-left) );
            if(ar[i]){
                // System.out.println("in false loop "+i*i);
                for(int j = i*i ; j<=right; j+=i)ar[j]=false;
            }
        }
        
        // for(boolean i:ar) System.out.print(i+" ");
        // System.out.println();
        int l=left;
        int r = l+1; 
        int diff = Integer.MAX_VALUE;
        int ans[] =  new int[]{-1,-1};
        while(l<r && r<=right){
            // System.out.println(l+"   "+r);
            if(ar[l]==ar[r] && ar[l]==true){
                if(diff>r-l){
                    diff = r-l;
                    ans[0]=l;
                    ans[1]=r;
                }
                    l=r;
                    r++;
                
            }
            else{
                if(ar[l]==true)r++;
                else if(ar[r]==true){
                    l=r;
                    r++;
                }else{
                    r++;
                    l++;
                }
            }
        }

        return ans;
        //return (l<r && left!=l && right!=r) ? ans : new int[]{-1,-1};
    }
}
