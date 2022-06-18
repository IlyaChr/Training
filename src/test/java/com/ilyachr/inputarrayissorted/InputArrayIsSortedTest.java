package com.ilyachr.inputarrayissorted;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputArrayIsSortedTest {

    @Test
    void twoSum() {
        InputArrayIsSorted inputArrayIsSorted = new InputArrayIsSorted();

        int[] array = {2, 7, 11, 15};
        int[] result = inputArrayIsSorted.twoSum(array, 9);
        assertEquals(Arrays.asList(1, 2), IntStream.of(result).boxed().collect(Collectors.toList()));

    }
}