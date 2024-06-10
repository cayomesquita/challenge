class MinStack:

    def __init__(self):
        self.stack = []
        self.stackMin = []

    def push(self, val: int) -> None:
        self.stack.append(val)
        if len(self.stackMin) > 0:
            self.stackMin.append(val if val < self.stackMin[-1] else self.stackMin[-1])
        else:
            self.stackMin.append(val)

    def pop(self) -> None:
        if len(self.stack) > 0:
            self.stack.pop()
            self.stackMin.pop()

    def top(self) -> int:
        if len(self.stack) > 0:
            return self.stack[-1]
        return None

    def getMin(self) -> int:
        return self.stackMin[-1]



# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()