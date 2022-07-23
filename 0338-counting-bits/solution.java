class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0]=0;
        int count = -1 ;
        //R System.out.println(15%2);
        //Q System.out.println(15/2);
        
        for(int i =1 ; i <=n ; i++){
           // System.out.println("i "+i +" count "+count);
            if(i%(Math.pow(2, count))==0){ 
                ans[i]=1;
                count++;
            }else{
                ans[i]= ans[i%((int)(Math.pow(2,count)))]+1;
            }
          //  if(i>Math.pow(2, count)) count++;
        }
        return ans;
    }
}
