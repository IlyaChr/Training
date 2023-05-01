package com.ilyachr.reverselinkedlist;


/**
 * 206. Reverse Linked List
 */
public class ReverseLinkedList {


    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new ListNode(head.val);
        }
        ListNode newHead = new ListNode();
        //reverseListRec(head, newHead);
        reverseLoop(head, newHead);
        return newHead;
    }


    private static ListNode reverseListRec(ListNode head, ListNode newHead) {
        if (head.next == null) {
            newHead.val = head.val;
            return newHead;
        }
        ListNode it = reverseListRec(head.next, newHead);
        it.next = new ListNode(head.val);
        return it.next;
    }

    private static void reverseLoop(ListNode head, ListNode newHead) {
        ListNode it = head;
        ListNode prevIt = null;

        while (it != null) {
            if (prevIt != null) {
                ListNode nextNode = new ListNode();
                nextNode.val = prevIt.val;
                nextNode.next = newHead.next;
                newHead.next = nextNode;
                newHead.val = it.val;
            }
            prevIt = it;
            it = it.next;
        }
    }
}
