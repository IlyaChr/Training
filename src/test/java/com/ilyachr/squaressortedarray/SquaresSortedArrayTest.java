package com.ilyachr.squaressortedarray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquaresSortedArrayTest {

    @Test
    void sortedSquares() {
        SquaresSortedArray squaresSortedArray = new SquaresSortedArray();
        assertEquals(List.of(0, 1, 9, 16, 100), Arrays.stream(squaresSortedArray.sortedSquares(IntStream.of(-4, -1, 0, 3, 10).toArray())).boxed().collect(Collectors.toList()));
        assertEquals(List.of(4, 9, 9, 49, 121), Arrays.stream(squaresSortedArray.sortedSquares(IntStream.of(-7, -3, 2, 3, 11).toArray())).boxed().collect(Collectors.toList()));
    }

    @Test
    void mergeSortedArrays() {
        SquaresSortedArray squaresSortedArray = new SquaresSortedArray();
        assertEquals(List.of(3, 4, 7, 8, 11), Arrays.stream(squaresSortedArray.mergeSortedArrays(IntStream.of(3, 7).toArray(), IntStream.of(4, 8, 11).toArray())).boxed().collect(Collectors.toList()));
    }
}