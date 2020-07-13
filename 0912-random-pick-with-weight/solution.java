class Solution {
    int ar[];
    public Solution(int[] w) {
        ar = new int[w.length];
        ar[0]=w[0];
        for (int i =1 ; i<w.length ; i++){
            ar[i]=ar[i-1]+w[i];
            
        }
    }
    
    public int pickIndex() {
        int t = (int)(Math.random()*ar[ar.length-1]);
        int l =0;
        int h = ar.length-1;
        
        while(l<=h){
            int mid = l+(h-l)/2;
            if(ar[mid]<=t)
                l=mid+1;
            else
                h=mid-1;
        }
        return l;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
