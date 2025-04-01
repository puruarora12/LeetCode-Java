class Solution {
    public void nextPermutation(int[] nums) {
        int index =nums.length-2;
        int min = nums.length-2;
        
       
            while(index>= 0 && nums[index+1]<=nums[index]){
                    // min = nums[index]<nums[min]? index:min;
                    index--;
            }
            
            if(index<0){
                Arrays.sort(nums);
                return;
            }
            
            int index2 =index;     
                for( int i = nums.length-1 ; i>=0 ; i--)
                    if(nums[i]>nums[index2]){
                    index2=i;
                    break;
                    }
                    // index2=i;
            
            // System.out.println("to swap "+nums[index]+"  with "+nums[index2]);
            swap(nums, index , index2);
            
            reverse(nums, index+1);
        
    }
    private void swap(int[] nums, int index1 ,int index2){
        int temp = nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
    private void reverse(int[] nums, int index){
        int right =nums.length-1;
        while(index<=right){
            swap(nums, index, right);
            index++;
            right--;
        }
    }
}
