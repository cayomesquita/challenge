from typing import List


class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        stack = []
        arr = list(zip(position, speed))
        arr.sort()
        for p, s in arr[::-1]:
            stack.append((target - p)/s)
            if len(stack) > 1 and not (stack[-2] < stack[-1]): # if behind car (stack[-1]) finish later, there is no collision. Otherwise, there is collision and remove the behind car from the stack
                stack.pop()

        return len(stack)

class Solution2:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        stack = []
        arr = list(zip(position, speed))
        arr.sort()
        for p, s in arr[::-1]:
            timeToFinish = (target - p) / s
            if not stack:
                stack.append(timeToFinish)
            elif timeToFinish> stack[-1]:
                stack.append(timeToFinish)
        return len(stack)

print(Solution().carFleet(12,[10,8,0,5,3],[2,4,1,1,3]))
print(Solution().carFleet(10,[3],[3]))
print(Solution().carFleet(100,[0,2,4],[4,2,1]))
print(Solution2().carFleet(12,[10,8,0,5,3],[2,4,1,1,3]))
print(Solution2().carFleet(10,[3],[3]))
print(Solution2().carFleet(100,[0,2,4],[4,2,1]))