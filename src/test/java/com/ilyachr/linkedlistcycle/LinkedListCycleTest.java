package com.ilyachr.linkedlistcycle;

import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

    @Test
    void hasCycle() {
        LinkedListCycle cycle = new LinkedListCycle();

        LinkedListCycle.ListNode node_1 = new LinkedListCycle.ListNode(3);
        LinkedListCycle.ListNode node_2 = new LinkedListCycle.ListNode(2);
        LinkedListCycle.ListNode node_3 = new LinkedListCycle.ListNode(0);
        LinkedListCycle.ListNode node_4 = new LinkedListCycle.ListNode(4);

        node_1.setNext(node_2);

        node_2.setNext(node_3);

        node_3.setNext(node_4);

        node_4.setNext(node_2);

        cycle.hasCycle(node_1);

    }
}