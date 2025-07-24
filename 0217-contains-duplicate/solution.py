class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        singles = set(nums)
        if len(singles)== len(nums):
            return False
        else:
            return True
        
