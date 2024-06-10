class Solution:
    def isPalindrome(self, s: str) -> bool:
        def nextIndex(s:str, index:int, increment:int) -> int:
            index += increment
            while index >= 0 and index < len(s):
                if s[index].isalnum():
                    break
                index += increment
            return index

        i = nextIndex(s, -1, 1)
        j = nextIndex(s, len(s) , -1)
        while i <= j:
            if s[i].lower() != s[j].lower():
                return False
            i = nextIndex(s, i, 1)
            j = nextIndex(s, j, -1)
        return True


print(Solution().isPalindrome("A man, a plan, a canal: Panama"))
print(Solution().isPalindrome("race a car"))
print(Solution().isPalindrome(" "))
print(Solution().isPalindrome("0P"))