package com.ilyachr.inputarrayissorted;

import java.util.HashMap;
import java.util.Map;

public class InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int difference = target - numbers[i];
            Integer number = map.get(difference);

            if (number != null) {
                return new int[]{number+1, i+1};
            }

            map.put(numbers[i], i);
        }

        return new int[]{};
    }
}
