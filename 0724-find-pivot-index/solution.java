class Solution {
    public int pivotIndex(int[] nums) {
        int[] left = new int[nums.length];
        left[0]=nums[0];
        int[] right = new int[nums.length];
        right[nums.length-1]=nums[nums.length-1];
        for(int i =1 ; i<nums.length ; i++) left[i]=nums[i]+left[i-1];
        for(int i = nums.length-2 ; i>=0 ; i--) right[i]+=nums[i]+right[i+1];
        int res = -1;
        for(int i:left ) System.out.print(i);
        System.out.println();
        for(int i:right ) System.out.print(i);
        for(int i=0 ; i<nums.length ; i++) if(left[i]==right[i]) {res=i; break;}
        return res;
    }
}
