class Solution {
    public int matrixSum(int[][] nums) {
        int score = 0;
        int loops = nums[0].length;
        int[] maxs = new int[nums.length];
       
        while(loops-->0){
            int pos =0;
        for(int[] num : nums ){
            
            int temp = 0;
            
            for(int i =0; i<num.length ; i++){
               
                if(num[temp]<num[i]) temp = i;
            }
           //ystem.out.println(num[temp]);
            //stem.out.println();
            maxs[pos] =num[temp];
            
            pos++;
            num[temp]=0;
        }
           //or(int zz: maxs) System.out.println("maz "+zz);
           //ystem.out.println();
        Arrays.sort(maxs);
        score +=maxs[maxs.length-1];
        //stem.out.println(score);

        }
        return score;
    }
}
