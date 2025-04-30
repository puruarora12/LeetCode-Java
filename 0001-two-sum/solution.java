class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer  ,Integer> map = new HashMap<Integer, Integer>();
        int pre = 0 ;
        int nex = 0;
        for(int i  =0  ; i<nums.length ; i++){
            //System.out.println(i+"  "+(target-nums[i]));
            if( map.containsKey(nums[i])) {
                
                System.out.println(map.get(target-nums[i])) ;                                   
                                                 pre = i;
                                                  nex = map.get(nums[i]);
                                                 break;
                                                 }
            else map.put((target-nums[i] ), i);
            
            //for(int j : map.keySet()) System.out.println(j+"    "+map.get(j));
            //System.out.println(" ////// ");
        }
        //System.out.println(pre+"  "+nex);
        return new int[]{pre ,nex};
    }
}
