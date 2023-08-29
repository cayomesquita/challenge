class HeapSort:
    array = []

    def size(self) -> int:
        return len(self.array)

    def push(self, value):
        self.array.append(value)
        self.bubbleUp(len(self.array))

    def pop(self):
        if len(self.array) > 1:
            aux = self.array[0]
            self.array[0] = self.array.pop(len(self.array)-1)
            self.bubbleDown(1)
            return aux
        return self.array.pop(0)

    def bubbleUp(self, index: int):
        if index == 1:
            return
        parentIndex = int(index / 2)
        _,currentCount = self.array[index-1]
        _,parentCount = self.array[parentIndex-1]
        if currentCount < parentCount:
            self.swap(index-1, parentIndex-1)
            self.bubbleUp(parentIndex)

    def bubbleDown(self, index: int):
        leftIndex = index * 2
        rightIndex = leftIndex + 1
        childIndex = -1
        if rightIndex <= len(self.array):
            _, leftCount = self.array[leftIndex-1]
            _, rightCount = self.array[rightIndex-1]
            childIndex = rightIndex if rightCount < leftCount else leftIndex
        elif leftIndex <= len(self.array):
            childIndex = leftIndex
        if childIndex > 0:
            _, currentCount = self.array[index-1]
            _, childCount = self.array[childIndex-1]
            if childCount < currentCount:
                self.swap(childIndex-1, index-1)
                self.bubbleDown(childIndex)

    def swap(self, indexA: int, indexB: int):
        aux = self.array[indexA]
        self.array[indexA] = self.array[indexB]
        self.array[indexB] = aux