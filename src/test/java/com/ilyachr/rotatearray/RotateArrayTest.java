package com.ilyachr.rotatearray;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RotateArrayTest {

    @Test
    @Order(value = 1)
    void getShiftLeftNumber() {

        RotateArray rotateArray = new RotateArray();

        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(1, rotateArray.getShiftLeftPosition(arrayOne, 4, 5));
        assertEquals(6, rotateArray.getShiftLeftPosition(arrayOne, 6, 5));
        assertEquals(4, rotateArray.getShiftLeftPosition(arrayOne, 8, 5));
        int[] arrayTwo = {1};
        assertEquals(0, rotateArray.getShiftLeftPosition(arrayTwo, 8, 0));
    }


    @Test
    @Order(value = 2)
    void getShiftRightPosition() {

        RotateArray rotateArray = new RotateArray();

        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(2, rotateArray.getShiftRightPosition(arrayOne, 4, 5));
    }

    @Test
    @Order(value = 3)
    void rotate1() {

        RotateArray rotateArray = new RotateArray();

        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(arrayOne, 3);
        assertEquals(Arrays.asList(5, 6, 7, 1, 2, 3, 4), IntStream.of(arrayOne).boxed().collect(Collectors.toList()));

    }

    @Test
    @Order(value = 4)
    void rotate2() {

        RotateArray rotateArray = new RotateArray();

        int[] arrayOne = {-1, -100, 3, 99};
        rotateArray.rotate(arrayOne, 2);
        assertEquals(Arrays.asList(3, 99, -1, -100), IntStream.of(arrayOne).boxed().collect(Collectors.toList()));
    }

    @Test
    @Order(value = 5)
    void rotate3() {

        RotateArray rotateArray = new RotateArray();

        int[] arrayOne = {};
        rotateArray.rotate(arrayOne, 2);
        assertEquals(Collections.emptyList(), IntStream.of(arrayOne).boxed().collect(Collectors.toList()));
    }

    @Test
    @Order(value = 6)
    void rotate6() {
        RotateArray rotateArray = new RotateArray();

        int[] arrayOne = {1, 2, 3};
        rotateArray.rotate(arrayOne, 2);
        assertEquals(Arrays.asList(2, 3, 1), IntStream.of(arrayOne).boxed().collect(Collectors.toList()));
    }

    @Test
    @Order(value = 7)
    void rotate7() {
        RotateArray rotateArray = new RotateArray();

        int[] arrayOne = {1,2,3,4,5,6};
        rotateArray.rotate(arrayOne, 2);
        assertEquals(Arrays.asList(5,6,1,2,3,4), IntStream.of(arrayOne).boxed().collect(Collectors.toList()));
    }

    @Test
    @Order(value = 8)
    void rotate8() {
        RotateArray rotateArray = new RotateArray();

        int[] arrayOne = {1,2,3,4,5,6};
        rotateArray.rotate(arrayOne, 3);
        assertEquals(Arrays.asList(4,5,6,1,2,3), IntStream.of(arrayOne).boxed().collect(Collectors.toList()));
    }

}