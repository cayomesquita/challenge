from typing import List


class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        for token in tokens:
            if token == '+':
                val2, val1 = stack.pop(), stack.pop()
                stack.append(val1 + val2)
            elif token == '-':
                val2, val1 = stack.pop(), stack.pop()
                stack.append(val1 - val2)
            elif token == '*':
                val2, val1 = stack.pop(), stack.pop()
                stack.append(val1 * val2)
            elif token == '/':
                val2, val1 = stack.pop(), stack.pop()
                stack.append(int(val1 / val2))
            else:
                stack.append(int(token))
        return stack[0]

print(Solution().evalRPN(["2","1","+","3","*"]))