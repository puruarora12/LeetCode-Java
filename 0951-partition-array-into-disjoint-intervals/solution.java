class Solution {
    public int partitionDisjoint(int[] nums) {
        int min = searchmin(nums);
        int lastpos = 0 ; 
        for(int i = 0 ;  i <nums.length ;i++){
            if (nums[i]==min)
                lastpos = i ;
        }
        
        
       
        //int ans = lastpos;
        int ans = 0;
        int start =0;
       // System.out.println("min "+min+" lastpos "+lastpos+"  maxinlist "+maxinlist);
        
        while(true){
        int maxinlist = maxelement(nums,start, lastpos);
        if(maxinlist==nums[lastpos]) return 1;
         ans= returnindex(nums,lastpos, maxinlist );
         if(maxelement(nums , lastpos , ans)>maxinlist){
             start=lastpos;
             lastpos =ans;
            continue;
         }
        else break;
        }
        return ans+1;
    }
    public int returnindex(int[] nums , int lastpos , int maxinlist){
        int temp = lastpos ;  
        for(int i =lastpos ; i<nums.length ; i++){
            if(nums[i]<maxinlist)
                temp = i;
        }
        return temp;
    }
    public int maxelement(int[] nums ,int start, int index ){
        int temp = Integer.MIN_VALUE;
        for(int i =  start ; i <=index ; i++){
            if (nums[i]>temp)
                temp = nums[i];
        }
        return temp;
    }
    
    public int searchmin(int[] nums){
        int ar[] = nums.clone();
        Arrays.sort(ar);
        return ar[0];
    }
}
