from typing import List


class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        highestArea = 0
        stack = []

        for i, height in enumerate(heights):
            if stack:
                auxI = i
                while stack and height < stack[-1][1]:
                    auxI, auxHeight = stack.pop()
                    auxArea = (i - auxI) * auxHeight
                    highestArea = max(highestArea, auxArea)
                if stack and height == stack[-1][1]:
                    continue
                stack.append((auxI, height))
            else:
                stack.append((i, height))

        while stack:
            auxI, auxHeight = stack.pop()
            auxArea = (len(heights) - auxI) * auxHeight
            highestArea = max(highestArea, auxArea)

        return highestArea


print(Solution().largestRectangleArea([2, 1, 5, 6, 2, 3]))
print(Solution().largestRectangleArea([2, 4]))
