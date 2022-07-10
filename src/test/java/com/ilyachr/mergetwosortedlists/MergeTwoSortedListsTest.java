package com.ilyachr.mergetwosortedlists;

import com.ilyachr.mergetwosortedlists.MergeTwoSortedLists.ListNode;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists() {

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        assertTrue(checkNodes(getHeaderNode(IntStream.of(1, 2, 4, 7, 8, 10, 11).toArray()),
                mergeTwoSortedLists.mergeTwoLists(getHeaderNode(IntStream.of(1, 4, 7, 10).toArray()), getHeaderNode(IntStream.of(2, 8, 11).toArray()))));
    }

    @Test
    @Order(value = 2)
    void mergeTwoLists2() {

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        assertTrue(checkNodes(getHeaderNode(IntStream.of(1, 1, 2, 3, 4, 4, 7).toArray()),
                mergeTwoSortedLists.mergeTwoLists(getHeaderNode(IntStream.of(1, 2, 4).toArray()), getHeaderNode(IntStream.of(1, 3, 4, 7).toArray()))));
    }


    private boolean checkNodes(ListNode node_1, ListNode node_2) {
        ListNode testNode_1 = node_1;
        ListNode tistNode_2 = node_2;

        while (testNode_1 != null || tistNode_2 != null) {
            if (testNode_1 != null && tistNode_2 != null && testNode_1.val == tistNode_2.val) {
                testNode_1 = testNode_1.next;
                tistNode_2 = tistNode_2.next;
                continue;
            }
            return false;
        }
        return true;
    }

    private ListNode getHeaderNode(int[] values) {

        ListNode headerNode = null;
        ListNode iterNode = null;

        for (int value : values) {
            if (headerNode == null) {
                headerNode = new ListNode(value);
                iterNode = headerNode;
            } else {
                iterNode.next = new ListNode(value);
                iterNode = iterNode.next;
            }
        }
        return headerNode;
    }


}