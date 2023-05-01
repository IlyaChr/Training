package com.ilyachr.containsduplicate;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 217. Contains Duplicate
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = Stream.of(nums).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toSet());

        return set.size() != nums.length;
    }
}
