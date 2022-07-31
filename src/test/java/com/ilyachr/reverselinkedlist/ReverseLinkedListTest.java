package com.ilyachr.reverselinkedlist;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static com.ilyachr.utils.ListUtils.LIST_UTILS;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReverseLinkedListTest {

    @Test
    void reverseList() {

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        assertTrue(LIST_UTILS.checkNodes(LIST_UTILS.getHeaderNode(IntStream.of(1, 2).toArray()),
                reverseLinkedList.reverseList(LIST_UTILS.getHeaderNode(IntStream.of(2, 1).toArray()))));

        assertTrue(LIST_UTILS.checkNodes(LIST_UTILS.getHeaderNode(IntStream.of(1, 2,3,4,5).toArray()),
                reverseLinkedList.reverseList(LIST_UTILS.getHeaderNode(IntStream.of(5,4,3,2,1).toArray()))));

        assertTrue(LIST_UTILS.checkNodes(LIST_UTILS.getHeaderNode(IntStream.of(1).toArray()),
                reverseLinkedList.reverseList(LIST_UTILS.getHeaderNode(IntStream.of(1).toArray()))));
    }

}