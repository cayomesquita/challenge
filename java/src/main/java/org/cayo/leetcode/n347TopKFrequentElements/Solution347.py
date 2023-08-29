from typing import List

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter = {}
        for i in nums:
            if i not in counter:
                counter[i] = 0
            counter[i] += 1

        buckets = [[] for i in range(len(nums)+1)]
        for num, count in counter.items():
            buckets[count].append(num)

        solution = []
        for i in range(len(nums),0,-1):
            for j in buckets[i]:
                solution.append(j)
                if len(solution)==k:
                    return solution
        return solution

print(Solution().topKFrequent([1,1,1,2,2,3],2))
print(Solution().topKFrequent([1],1))

