from typing import List

class Solution:
    def trap(self, height: List[int]) -> int:
        l,r = 0, len(height) - 1
        maxLeft, maxRight = height[l], height[r]
        totalArea = 0
        while ( l < r):
            leftHeight, rightHeight = height[l], height[r]
            if rightHeight > leftHeight: # move left pointer
                l+=1
                indexHeight = height[l]
                area = min(maxLeft, maxRight) - indexHeight
                maxLeft = max(maxLeft, indexHeight)
            else: # move right pointer
                r-=1
                indexHeight = height[r]
                area = min(maxLeft, maxRight) - indexHeight
                maxRight = max(maxRight, indexHeight)
            if area > 0 :
                totalArea += area
        return totalArea

    def trap2(self, height: List[int]) -> int:
        l,r = 0, len(height) - 1
        maxLeft, maxRight = 0,0
        totalArea = 0
        while l < r:
            leftHeight, rightHeight = height[l], height[r]
            maxLeft, maxRight = max(maxLeft, leftHeight), max(maxRight, rightHeight)
            if rightHeight > leftHeight: # move left pointer
                area = min(maxLeft, maxRight) - leftHeight
                l += 1
            else: # move right pointer
                area = min(maxLeft, maxRight) - rightHeight
                r -= 1
            if area > 0:
                totalArea += area
        return totalArea

print(Solution().trap([0,1,0,2,1,0,1,3,2,1,2,1]))
print(Solution().trap([4,2,0,3,2,5]))
print(Solution().trap2([0,1,0,2,1,0,1,3,2,1,2,1]))
print(Solution().trap2([4,2,0,3,2,5]))