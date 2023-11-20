from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        l,r = 0, len(height) -1
        maxArea = -1
        while l < r:
            area = (r-l) * min(height[l], height[r])
            maxArea = max(maxArea, area)
            if height[r] < height[l]:
                r -= 1
            else:
                l += 1
        return maxArea

print(Solution().maxArea([1,8,6,2,5,4,8,3,7]))
print(Solution().maxArea([1,1]))