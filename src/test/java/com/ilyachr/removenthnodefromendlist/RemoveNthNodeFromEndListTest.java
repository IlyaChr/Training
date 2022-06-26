package com.ilyachr.removenthnodefromendlist;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RemoveNthNodeFromEndListTest {

    @Test
    @Order(value = 1)
    void removeNthFromEnd1() {

        RemoveNthNodeFromEndList removeNthNodeFromEndList = new RemoveNthNodeFromEndList();

        RemoveNthNodeFromEndList.ListNode node_1 = new RemoveNthNodeFromEndList.ListNode(1);
        RemoveNthNodeFromEndList.ListNode node_2 = new RemoveNthNodeFromEndList.ListNode(2);
        RemoveNthNodeFromEndList.ListNode node_3 = new RemoveNthNodeFromEndList.ListNode(3);
        RemoveNthNodeFromEndList.ListNode node_4 = new RemoveNthNodeFromEndList.ListNode(4);
        RemoveNthNodeFromEndList.ListNode node_5 = new RemoveNthNodeFromEndList.ListNode(5);

        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;

        assertEquals(node_1, removeNthNodeFromEndList.removeNthFromEnd2(node_1, 2));

    }


    @Test
    @Order(value = 2)
    void removeNthFromEnd2() {

        RemoveNthNodeFromEndList removeNthNodeFromEndList = new RemoveNthNodeFromEndList();

        RemoveNthNodeFromEndList.ListNode node_1 = new RemoveNthNodeFromEndList.ListNode(1);
        RemoveNthNodeFromEndList.ListNode node_2 = new RemoveNthNodeFromEndList.ListNode(2);
        RemoveNthNodeFromEndList.ListNode node_3 = new RemoveNthNodeFromEndList.ListNode(3);
        RemoveNthNodeFromEndList.ListNode node_4 = new RemoveNthNodeFromEndList.ListNode(4);
        RemoveNthNodeFromEndList.ListNode node_5 = new RemoveNthNodeFromEndList.ListNode(5);

        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;

        assertEquals(node_1, removeNthNodeFromEndList.removeNthFromEnd2(node_1, 1));

    }


    @Test
    @Order(value = 3)
    void removeNthFromEnd3() {

        RemoveNthNodeFromEndList removeNthNodeFromEndList = new RemoveNthNodeFromEndList();

        RemoveNthNodeFromEndList.ListNode node_1 = new RemoveNthNodeFromEndList.ListNode(1);


        assertNull(removeNthNodeFromEndList.removeNthFromEnd2(node_1, 1));

    }

    @Test
    @Order(value = 4)
    void removeNthFromEnd4() {

        RemoveNthNodeFromEndList removeNthNodeFromEndList = new RemoveNthNodeFromEndList();

        RemoveNthNodeFromEndList.ListNode node_1 = new RemoveNthNodeFromEndList.ListNode(1);
        RemoveNthNodeFromEndList.ListNode node_2 = new RemoveNthNodeFromEndList.ListNode(2);
        //RemoveNthNodeFromEndList.ListNode node_3 = new RemoveNthNodeFromEndList.ListNode(3);
        node_1.next = node_2;
        //node_2.next = node_3;

        assertEquals(node_2, removeNthNodeFromEndList.removeNthFromEnd2(node_1, 2));

    }


    @Test
    @Order(value = 5)
    void removeNthFromEnd5() {

        RemoveNthNodeFromEndList removeNthNodeFromEndList = new RemoveNthNodeFromEndList();

        RemoveNthNodeFromEndList.ListNode node_1 = new RemoveNthNodeFromEndList.ListNode(1);
        RemoveNthNodeFromEndList.ListNode node_2 = new RemoveNthNodeFromEndList.ListNode(2);
        RemoveNthNodeFromEndList.ListNode node_3 = new RemoveNthNodeFromEndList.ListNode(3);
        RemoveNthNodeFromEndList.ListNode node_4 = new RemoveNthNodeFromEndList.ListNode(4);
        RemoveNthNodeFromEndList.ListNode node_5 = new RemoveNthNodeFromEndList.ListNode(5);
        RemoveNthNodeFromEndList.ListNode node_6 = new RemoveNthNodeFromEndList.ListNode(6);
        RemoveNthNodeFromEndList.ListNode node_7 = new RemoveNthNodeFromEndList.ListNode(7);
        RemoveNthNodeFromEndList.ListNode node_8 = new RemoveNthNodeFromEndList.ListNode(8);
        RemoveNthNodeFromEndList.ListNode node_9 = new RemoveNthNodeFromEndList.ListNode(9);
        RemoveNthNodeFromEndList.ListNode node_10 = new RemoveNthNodeFromEndList.ListNode(10);

        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;
        node_5.next = node_6;
        node_6.next = node_7;
        node_7.next = node_8;
        node_8.next = node_9;
        node_9.next = node_10;

        RemoveNthNodeFromEndList.ListNode newHead = removeNthNodeFromEndList.removeNthFromEnd2(node_1, 7);

        assertEquals(node_1, newHead);

        assertEquals(newHead.next.next, node_3);
        assertEquals(newHead.next.next.next, node_5);

    }


}