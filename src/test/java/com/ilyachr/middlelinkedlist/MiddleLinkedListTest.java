package com.ilyachr.middlelinkedlist;

import com.ilyachr.middlelinkedlist.MiddleLinkedList;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleLinkedListTest {

    @Test
    @Order(value = 1)
    void middleNode1() {

        MiddleLinkedList middleLinkedList = new MiddleLinkedList();

        MiddleLinkedList.ListNode node_1 = new MiddleLinkedList.ListNode(1);
        MiddleLinkedList.ListNode node_2 = new MiddleLinkedList.ListNode(2);
        MiddleLinkedList.ListNode node_3 = new MiddleLinkedList.ListNode(3);
        MiddleLinkedList.ListNode node_4 = new MiddleLinkedList.ListNode(4);
        MiddleLinkedList.ListNode node_5 = new MiddleLinkedList.ListNode(5);

        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;

        assertEquals(node_3,middleLinkedList.middleNode(node_1));

    }

    @Test
    @Order(value = 2)
    void middleNode2() {

        MiddleLinkedList middleLinkedList = new MiddleLinkedList();

        MiddleLinkedList.ListNode node_1 = new MiddleLinkedList.ListNode(1);
        MiddleLinkedList.ListNode node_2 = new MiddleLinkedList.ListNode(2);
        MiddleLinkedList.ListNode node_3 = new MiddleLinkedList.ListNode(3);
        MiddleLinkedList.ListNode node_4 = new MiddleLinkedList.ListNode(4);
        MiddleLinkedList.ListNode node_5 = new MiddleLinkedList.ListNode(5);
        MiddleLinkedList.ListNode node_6 = new MiddleLinkedList.ListNode(5);

        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;
        node_5.next = node_6;

        assertEquals(node_4,middleLinkedList.middleNode(node_1));

    }
}