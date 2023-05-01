package com.ilyachr.reverselinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void reverseList() {

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();


        ReverseLinkedList.ListNode node_1 = new ReverseLinkedList.ListNode(1);

        ReverseLinkedList.ListNode node_2 = new ReverseLinkedList.ListNode(2);

        ReverseLinkedList.ListNode node_3 = new ReverseLinkedList.ListNode(3);

        ReverseLinkedList.ListNode node_4 = new ReverseLinkedList.ListNode(4);

        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;


        reverseLinkedList.reverseList(node_1);

    }
}