class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int index = 0 ; 
        int value = 1;
        int maxsum = 0;
        int returnvalue = 0 ;
        Arrays.sort(banned);
        HashSet<Integer> set = new HashSet<>();
        for(int i: banned){
           // System.out.print(i+" ");
            if(!set.contains(i)) set.add(i);
        }
       // System.out.println();
        
        while(maxsum+value<=maxSum && value<=n){
            if(!set.contains(value)){
                //System.out.println("before value "+value + " maxvalue "+maxsum+ "  returnvalue "+returnvalue);
                returnvalue++;
                maxsum+=value;
                value++;
                
                //System.out.println("after value "+value + " maxvalue "+maxsum+ "  returnvalue "+returnvalue);
                
            }
            else{
                //index++;
                value++;
            }
        }
     return returnvalue;   
    }
}
