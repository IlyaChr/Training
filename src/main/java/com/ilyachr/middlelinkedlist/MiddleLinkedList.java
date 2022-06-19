package com.ilyachr.middlelinkedlist;

/**
 * 876. Middle of the Linked List
 */
public class MiddleLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {

        ListNode currentNode = head;

        int count = 0;

        while (currentNode.next != null){
            currentNode = currentNode.next;
            count++;
        }

        currentNode = head;

        for (int i = 0; i < (count % 2 == 0 ? count/2 : count/2+1); i++) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

}
