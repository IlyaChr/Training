package com.ilyachr.linkedlistcycle;

import java.util.HashSet;
import java.util.Set;

/**
 * 141. Linked List Cycle
 */
public class LinkedListCycle {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> listNodes = new HashSet<>();

        ListNode node = head;

        while (node != null) {
            if (listNodes.contains(node)) {
                return true;
            }
            listNodes.add(node);
            node = node.next;
        }
        return false;
    }

}
