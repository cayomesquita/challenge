from typing import List




class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        i, l , r = 0, 0, 0
        result = []
        while i < len(nums) - 2:
            l = i + 1
            r = len(nums) - 1
            target = -nums[i]
            while l < r:
                sum = nums[l] + nums[r]
                if sum == target:
                   result.append((nums[i], nums[l], nums[r]))
                if sum > target:
                    r = nextIndex(nums, r, nums[r], False, l)
                else:
                    l = nextIndex(nums, l, nums[l], True, r)
            i = nextIndex(nums, i, nums[i], True, len(nums) - 1)
        return result

def nextIndex(nums: List[int], i: int, value: int, ascending: bool, limit: int):
    while nums[i] == value and ((ascending and i < limit) or (~ascending and i > limit)):
        i = i + 1 if ascending else i - 1
    return i

print(Solution().threeSum([-1,0,1,2,-1,-4]))
print(Solution().threeSum([0,1,1]))
print(Solution().threeSum([0,0,0]))
print(Solution().threeSum([-2,0,1,1,2]))
print(Solution().threeSum([-2,-2,-2,0,0,0,0,1,1,1,1,1,2,2,2,2,2]))