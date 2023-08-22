class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        mapA, mapB = {}, {}
        for i in range(len(s)):
            letterA = s[i]
            letterB = t[i]
            mapA[letterA] = 1 + mapA.get(letterA, 0)
            mapB[letterB] = 1 + mapB.get(letterB, 0)

        for i in mapA.keys():
            if mapA[i] != mapB.get(i, 0):
                return False

        return True



s = Solution()
print(s.isAnagram("anagram","nagaram"))