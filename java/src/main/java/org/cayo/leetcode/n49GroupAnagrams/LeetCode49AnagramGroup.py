from typing import List
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        solution = {}
        for word in strs:
            count = [0] * 26
            for letter in word:
                count[ord(letter)-ord("a")] += 1
            key = tuple(count)
            if not key in solution:
                solution[key] = []
            solution[key].append(word)
        return [i for i in solution.values()]

print(Solution().groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
print(Solution().groupAnagrams([""]))
print(Solution().groupAnagrams(["a"]))