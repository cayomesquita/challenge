package org.cayo.leetcode.n735AsteroidCollision

import java.util.*
import kotlin.math.abs

class Solution735 {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        var stack = LinkedList<Int>()
        for (asteroid in asteroids){
            if (asteroid > 0 || stack.isEmpty()) {
                stack.push(asteroid)
                continue
            }
            // asteroid is negative
            var insert = true
            while (!stack.isEmpty()){
                var aux = stack.pop()
                if (aux < 0) {
                    stack.push(aux)
                    break
                }
                val asteroidAbs = abs(asteroid)
                if (aux == asteroidAbs) {
                    insert = false
                    break
                }
                if (aux > asteroidAbs) {
                    stack.push(aux)
                    insert = false
                    break
                }
            }
            if (insert) {
                stack.push(asteroid)
            }
        }
        return stack.reversed().toIntArray()
    }
}