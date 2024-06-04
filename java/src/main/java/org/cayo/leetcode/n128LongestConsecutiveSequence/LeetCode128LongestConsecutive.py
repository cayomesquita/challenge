import collections
from typing import List

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        maxLength = 0
        ranges = collections.defaultdict(tuple)
        visited = collections.defaultdict(bool)
        for num in nums:
            if num not in visited:
                visited[num] = True
                l,r = num, num
                if (num + 1) in ranges:
                    _,r = ranges[num+1]
                if (num - 1) in ranges:
                    l,_ = ranges[num -1]
                ranges[l] = (l,r) # most left num in the range will have the most updated range
                ranges[r] = (l,r) # most right num in the range will have the most updated range
                length = r - l + 1
                maxLength = max(maxLength, length)
        return maxLength

    def longestConsecutive2(self, nums: List[int]) -> int:
        numsSet = set(nums)
        maxLength = 0
        for num in nums:
            if num - 1 not in numsSet: # initial number
                length = 1
                while num + length in numsSet:
                    length += 1
                maxLength = max(maxLength, length)
        return maxLength

print(Solution().longestConsecutive([100,4,200,1,3,2]))
print(Solution().longestConsecutive([5,100,4,101,200,1,3,2]))
print(Solution().longestConsecutive([0,3,7,2,5,8,4,6,0,1]))
print(Solution().longestConsecutive([4,2,2,-4,0,-2,4,-3,-4,-4,-5,1,4,-9,5,0,6,-8,-1,-3,6,5,-8,-1,-5,-1,2,-9,1]))