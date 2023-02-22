package com.ilyachr.twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void twoSum() {

        TwoSum twoSum = new TwoSum();

        int[] test_1 = {2, 7, 11, 15};
        int[] test_1_res = {0, 1};


        Assertions.assertArrayEquals(test_1_res, twoSum.twoSum(test_1, 9));


        int[] test_2 = {3, 2, 4};
        int[] test_2_res = {1, 2};

        Assertions.assertArrayEquals(test_2_res, twoSum.twoSum(test_2, 6));

        int[] test_3 = {3, 3};
        int[] test_3_res = {0, 1};

        Assertions.assertArrayEquals(test_3_res, twoSum.twoSum(test_3, 6));

    }
}