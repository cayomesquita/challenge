package org.cayo.leetcode.n1381DesignStackWithIncrementOperation

class CustomStack(maxSize: Int) {

    val array = IntArray(maxSize)
    val limit = maxSize
    var index = 0

    fun push(x: Int) {
        if (index == limit) {
            return // do nothing
        }
        array[index++] = x
    }

    fun pop(): Int {
        if (index == 0) {
            return -1
        }
        return array[--index]
    }

    fun increment(k: Int, `val`: Int) {
        for (i in 0..k - 1) {
            if (i == index) {
                break
            }
            array[i] += `val`
        }
    }

}

/**
 * Your CustomStack object will be instantiated and called as such:
 * var obj = CustomStack(maxSize)
 * obj.push(x)
 * var param_2 = obj.pop()
 * obj.increment(k,`val`)
 */