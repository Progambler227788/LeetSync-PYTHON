class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        temp = [0] * len(nums)
        for i in range(len(nums)):
            temp[i] = nums[nums[i]]
          

        return temp
        