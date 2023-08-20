package org.cayo.leetcode.n1105FillingBookcaseShelves

class Solution1105 {
    fun minHeightShelves(books: Array<IntArray>, shelfWidth: Int): Int {
        var bs = IntArray(books.size + 1)

        for (i in books.indices) {
            var currBookWidth = books[i][0]
            var currBookHeight = books[i][1]
            var bsIndex = i+1
            bs[bsIndex] = bs[i] + currBookHeight // create new shelf
            // try to combine previous books in the current shelf
            var currShelfWidth = currBookWidth
            var currShelfHeight = currBookHeight
            for (j in i - 1 downTo 0) {
                var previousBookWidth = books[j][0]
                var previousBookHeight = books[j][1]
                currShelfHeight = Math.max(currShelfHeight, previousBookHeight)
                currShelfWidth = currShelfWidth + previousBookWidth
                if (currShelfWidth > shelfWidth) { // check the shelfwidth limit
                    break
                }
                if (bs[j] + currShelfHeight <= bs[bsIndex]){ // check if combining previous books in the current shelf worth it
                    bs[bsIndex] = bs[j] + currShelfHeight
                }
            }
        }

        return bs[books.size] // bs for the last book
    }
}