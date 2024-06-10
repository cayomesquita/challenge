from typing import List


class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        result = [0] * len(temperatures)
        stack = []
        for i, temperature in enumerate(temperatures):
            while len(stack) > 0 and temperature > stack[-1][0]:
                _, auxI = stack.pop()
                result[auxI] = i - auxI
            stack.append(((temperature, i)))
        return result


print(Solution().dailyTemperatures([73, 74, 75, 71, 69, 72, 76, 73]))
print(Solution().dailyTemperatures([30, 40, 50, 60]))
print(Solution().dailyTemperatures([30, 60, 90]))
