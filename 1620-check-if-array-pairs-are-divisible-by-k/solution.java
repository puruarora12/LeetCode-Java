class Solution {
    public boolean canArrange(int[] arr, int k) {
        int rems[] = new int[k+k-1];
        for(int i: arr)
            if(i>=0)
            rems[(i%k)+k-1]++;
        else
            rems[k-1+(i%k)]++;
        
        findMatch(0,rems.length-1,rems);
        findMatch(0,k-2,rems);
        findMatch(k,k+k-2,rems);
       
        
        for(int z:rems)if(z!=0)return false;
            
        
    return true;
    }
    
    
    public static void findMatch(int i , int j , int[] rems){
          while(i<=j){
            if(rems[i]>=1 && rems[j]>=1){
                if(i==j) rems[i]%=2;
                else{
                int decrease = Math.min(rems[i], rems[j]);
                rems[i]-=decrease;
                rems[j]-=decrease;
                }
            } 
            i++; j--;
        }
    }
}
