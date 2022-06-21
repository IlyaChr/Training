package com.ilyachr.removenthnodefromendlist;

/**
 * 19. Remove Nth Node From End of List
 */
public class RemoveNthNodeFromEndList {

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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode = head;
        if (head == null || head.next == null) {
            return null;
        }


        int size = 1;

        while (currentNode.next != null) {
            size++;
            currentNode = currentNode.next;
        }

        currentNode = head;

        ListNode prevNode = head;

        for (int i = 0; i < size; i++) {
            if (i == size - n) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else if (currentNode.next == null) {
                    prevNode.next = null;
                } else {
                    prevNode.next = currentNode.next;
                }
                return head;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        return head;
    }


    public ListNode removeNthFromEnd2(ListNode head, int n) {

        ListNode delayNode = head;
        ListNode prevDelayNode = head;

        if (head == null || head.next == null) {
            return null;
        }

        int i = 0;

        for (ListNode currentNode = head; currentNode != null; currentNode = currentNode.next, i++) {
            if (i >= n) {
                prevDelayNode = delayNode;
                delayNode = delayNode.next;
            }
        }

        if (delayNode == head) {
            head = delayNode.next;
        } else if (delayNode.next == null) {
            prevDelayNode.next = null;
        } else {
            prevDelayNode.next = delayNode.next;
        }

        return head;
    }

}
