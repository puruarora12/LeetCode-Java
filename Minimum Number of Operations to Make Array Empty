class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer ,  Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
            map.put(nums[i] ,  map.getOrDefault(nums[i] , 0)+1);
        }
        int count = 0;
        for(int i :map.values()){
            if(i==1) return -1;
            count+=(i+2)/3;
            
        }
        return count;
    }
}
