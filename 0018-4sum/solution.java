class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ar= new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0 ; i <nums.length-3 ; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j = i+1 ; j<nums.length-2 ; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                for(int k = j+1 ; k<nums.length-1 ; k++){
                    if(k>j+1 && nums[k]==nums[k-1]) continue;
                    for(int l = k+1 ; l<nums.length ; l++){
                        if(l>k+1 && nums[l]==nums[l-1]) continue;
                        if(nums[l]==target - nums[i]-nums[j]-nums[k]) {
                            List<Integer> arr= new ArrayList<>();
                            arr.add(nums[i]);
                            arr.add(nums[j]);
                            arr.add(nums[k]);
                            arr.add(nums[l]);
                            if(!ar.contains(arr)){
                                ar.add(arr);
                            set.add(arr);
                            }
                            
                        }
                    }
                }
            }
        }
        for(List<Integer> i:set){
            for(int j:i)
                System.out.print(j+" ");
            System.out.println();
        }
        return ar;
    }
}
