package com.ilyachr.searchinsertposition;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {

    @Test
    void searchInsert() {

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        assertEquals(0, searchInsertPosition.searchInsert(IntStream.of(1, 3, 5, 6).toArray(), 0));
        assertEquals(2, searchInsertPosition.searchInsert(IntStream.of(1, 3, 5, 6).toArray(), 5));
        assertEquals(1, searchInsertPosition.searchInsert(IntStream.of(1, 3, 5, 6).toArray(), 2));
        assertEquals(4, searchInsertPosition.searchInsert(IntStream.of(1, 3, 5, 6).toArray(), 7));
        assertEquals(0, searchInsertPosition.searchInsert(IntStream.of().toArray(), 7));
        assertEquals(1, searchInsertPosition.searchInsert(IntStream.of(1, 3, 5).toArray(), 2));
        assertEquals(0, searchInsertPosition.searchInsert(IntStream.of(1, 3).toArray(), 1));
    }
}