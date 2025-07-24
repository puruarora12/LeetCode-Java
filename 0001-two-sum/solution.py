class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for index,value in enumerate(nums):
            # print(f" index {index} with value {value} and remaining list is {nums[index+1:]} and target-value is {target-value}")
            nextHalf =nums[index+1:]
            if target-value in nextHalf:
                return [index, 1+index+nextHalf.index(target-value)] 

        return [0,0]
