package com.ilyachr.climbingstairs;

import java.util.HashMap;
import java.util.Map;

/**
 * 70. Climbing Stairs
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        Map<Integer, Integer> climbStairsMap = new HashMap<>();
        return count(n, climbStairsMap);
    }

    private int count(int n, Map<Integer, Integer> climbStairsMap) {
        if (n == 2) {
            return 2;
        } else if (n == 1) {
            return 1;
        }

        Integer resultOne = climbStairsMap.get(n - 1);
        if (resultOne == null) {
            resultOne = count(n - 1, climbStairsMap);
            climbStairsMap.put(n - 1, resultOne);
        }

        Integer resultTwo = climbStairsMap.get(n - 2);
        if (resultTwo == null) {
            resultTwo = count(n - 2, climbStairsMap);
            climbStairsMap.put(n - 2, resultTwo);
        }

        return resultOne + resultTwo;
    }

}
