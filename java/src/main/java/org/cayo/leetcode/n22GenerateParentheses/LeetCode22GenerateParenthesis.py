from typing import List


class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        list: List[str] = []

        def generateParenthesisCombination(result: List[str], stack: str, maxLength: int, numOpener: int, numCloser: int):
            if numOpener > maxLength or numCloser > numOpener:
                return
            if len(stack) == maxLength * 2:
                result.append(stack)
            else:
                generateParenthesisCombination(result, stack + '(', maxLength, numOpener + 1, numCloser)
                generateParenthesisCombination(result, stack + ')', maxLength, numOpener, numCloser + 1)

        generateParenthesisCombination(list, '(', n, 1, 0)

        return list

class Solution2:
    def generateParenthesis(self, n: int) -> List[str]:
        list = []
        stack = []

        def backtrack(numOpener: int, numCloser: int):
            if numCloser == numOpener == n:
                list.append(''.join(stack))
            else:
                if numOpener < n:
                    stack.append('(')
                    backtrack(numOpener + 1, numCloser)
                    stack.pop()
                if numCloser < numOpener:
                    stack.append(')')
                    backtrack(numOpener, numCloser + 1)
                    stack.pop()
        backtrack(0, 0)
        return list

print(Solution().generateParenthesis(3))
print(Solution().generateParenthesis(2))
print(Solution().generateParenthesis(1))
print(Solution2().generateParenthesis(3))
print(Solution2().generateParenthesis(2))
print(Solution2().generateParenthesis(1))

# 111000
# 110100
# 110010
# 101100
# 101010
#
# 1100
# 1010
