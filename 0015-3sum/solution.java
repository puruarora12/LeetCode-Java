class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0 ; i<nums.length-2 ; i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1])continue;
            // Set<Integer> set = new HashSet<>();
            int left =i+1;
            int right=nums.length-1;

            while(left<right){
                if(nums[left]+nums[i]+nums[right]==0){
                         List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[left]);
                    ls.add(nums[right]);
                    // Collections.sort(ls);
                    // if(!ans.contains(ls))
                    ans.add(ls);
                    while(left<right-1 && nums[right]==nums[right-1] ) right--;
                    while((left+1<right && nums[left]==nums[left+1] ) ) left++;
                    right--;
                    left++;

                }
                else if(  nums[left]+nums[i]+nums[right]>0)right--;
                //else if( || nums[left]+nums[i]+nums[right]<0)left++;
                else{ left++;
                   
                }

                // set.add(nums[index]);
                // index++;
            }
        }
        return ans;
    }
}
