package com.ilyachr.productofarrayexceptself;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

    @Test
    void productExceptSelf() {

        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

        int[] nums = {1, 2, 3, 4};

        int[] result = {24, 12, 8, 6};

        Assertions.assertArrayEquals(result, productOfArrayExceptSelf.productExceptSelf(nums));

    }
}