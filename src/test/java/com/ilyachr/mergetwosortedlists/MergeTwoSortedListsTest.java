package com.ilyachr.mergetwosortedlists;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static com.ilyachr.utils.ListUtils.LIST_UTILS;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists() {

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        assertTrue(LIST_UTILS.checkNodes(LIST_UTILS.getHeaderNode(IntStream.of(1, 2, 4, 7, 8, 10, 11).toArray()),
                mergeTwoSortedLists.mergeTwoLists(LIST_UTILS.getHeaderNode(IntStream.of(1, 4, 7, 10).toArray()), LIST_UTILS.getHeaderNode(IntStream.of(2, 8, 11).toArray()))));
    }

    @Test
    @Order(value = 2)
    void mergeTwoLists2() {

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        assertTrue(LIST_UTILS.checkNodes(LIST_UTILS.getHeaderNode(IntStream.of(1, 1, 2, 3, 4, 4, 7).toArray()),
                mergeTwoSortedLists.mergeTwoLists(LIST_UTILS.getHeaderNode(IntStream.of(1, 2, 4).toArray()), LIST_UTILS.getHeaderNode(IntStream.of(1, 3, 4, 7).toArray()))));
    }
}