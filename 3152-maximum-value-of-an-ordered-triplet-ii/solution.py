class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
        numlen = len(nums)
        maxs = [0]*numlen
        maxs[-1]=nums[-1]
        for i in range(numlen-2 , -1 , -1):
            maxs[i]=max(maxs[i+1] , nums[i])

        ans =0
        leftlarge = nums[0]
        for i in range(numlen-1):
            ans =max(ans, (leftlarge -nums[i])*maxs[i+1])
            leftlarge =max(leftlarge , nums[i])

        return ans
        
