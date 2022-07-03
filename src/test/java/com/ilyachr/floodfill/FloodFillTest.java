package com.ilyachr.floodfill;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FloodFillTest {

    @Test
    @Order(value = 1)
    void floodFill() {

        FloodFill floodFill = new FloodFill();

        int[][] array = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

        int[][] result = new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};

        assertTrue(Arrays.deepEquals((result), floodFill.floodFill(array, 1, 1, 2)));

    }


    @Test
    @Order(value = 2)
    void floodFill2() {

        FloodFill floodFill = new FloodFill();

        int[][] array = new int[][]{{1, 1, 1}, {1, 3, 0}, {1, 0, 1}};

        int[][] result = new int[][]{{1, 1, 1}, {1, 2, 0}, {1, 0, 1}};

        assertTrue(Arrays.deepEquals((result), floodFill.floodFill(array, 1, 1, 2)));

    }

    @Test
    @Order(value = 3)
    void floodFill3() {

        FloodFill floodFill = new FloodFill();

        int[][] array = new int[][]{{0, 0, 0}, {0, 0, 0}};

        int[][] result = new int[][]{{0, 0, 0}, {0, 0, 0}};

        assertTrue(Arrays.deepEquals((result), floodFill.floodFill(array, 0, 0, 0)));

    }
}