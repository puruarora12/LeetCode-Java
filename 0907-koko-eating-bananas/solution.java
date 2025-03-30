class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left =1;
        int right = piles[piles.length-1];
        // System.out.println(right);
        while(left<=right){
            int mid =left+(right-left)/2;
            long hours = check(piles, mid);
            // System.out.println(mid +"   "+ hours);
            if(hours>h)left =mid+1;
            else right=mid-1;

        }
        return left;
    }
    public long check(int[] pile , int value){
        long count =0 ;
        for(int i:pile){
            count+=i/value;

            if(i%value>0)count++;
        }
        return count;
    }
}
