package com.ilyachr.binarysearch;

import com.ilyachr.binarysearch.BinarySearch;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @Test
    void search() {

        BinarySearch binarySearch = new BinarySearch();

        assertEquals(4, binarySearch.search(Stream.of(-1, 0, 3, 5, 9, 12).mapToInt(i -> i).toArray(), 9));

        assertEquals(-1, binarySearch.search(Stream.of(-1, 0, 3, 5, 6, 12).mapToInt(i -> i).toArray(), 9));

        assertEquals(2, binarySearch.search(IntStream.of(-1, 0, 3, 5, 9, 12).toArray(), 3));

        assertEquals(-1, binarySearch.search(IntStream.of().toArray(), 3));

        assertEquals(0, binarySearch.search(IntStream.of(3).toArray(), 3));

        assertEquals(-1, binarySearch.search(IntStream.of(3).toArray(), 4));

    }
}