package com.ilyachr.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer diff = target - nums[i];
            Integer index = map.get(diff);

            if (index != null) {
                return new int[]{index, i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{};
    }

}
