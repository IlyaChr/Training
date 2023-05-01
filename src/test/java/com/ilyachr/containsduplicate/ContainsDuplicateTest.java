package com.ilyachr.containsduplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    @Test
    void containsDuplicate() {

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] test_1 = {10, 42, 52, 12, 25};

        Assertions.assertFalse(containsDuplicate.containsDuplicate(test_1));


        int[] test_2 = {10, 42, 52, 42, 25};

        Assertions.assertTrue(containsDuplicate.containsDuplicate(test_2));

        int[] test_3 = {};

        Assertions.assertFalse(containsDuplicate.containsDuplicate(test_3));
    }
}