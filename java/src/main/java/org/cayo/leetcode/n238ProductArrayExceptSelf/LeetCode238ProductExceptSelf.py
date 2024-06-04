from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        solution = [0]*len(nums)
        prefix = [1]*(len(nums)+1)
        suffix = [1]*(len(nums)+1)
        prefixValue = 1
        suffixValue = 1
        for i in range(len(nums)):
           prefixValue *= nums[i]
           prefix[i] = prefixValue
           j = len(nums)-i-1
           suffixValue *= nums[j]
           suffix[j] = suffixValue
        for i in range(len(nums)):
            solution[i] = prefix[i-1] * suffix[i+1]
        return solution

        def productExceptSelf2(self, nums: List[int]) -> List[int]:
            solution = [1]*len(nums)
            prefixValue = 1
            suffixValue = 1
            for i in range(len(nums)):
                solution[i] = solution[i] * prefixValue
                prefixValue *= nums[i]
                j = len(nums)-i-1
                solution[j] = solution[j] * suffixValue
                suffixValue *= nums[j]
            return solution

print(Solution().productExceptSelf([1,2,3,4]))
print(Solution().productExceptSelf([-1,1,0,-3,3]))

print(Solution().productExceptSelf2([1,2,3,4]))
print(Solution().productExceptSelf2([-1,1,0,-3,3]))

