package com.ilyachr.utils;

public enum ListUtils {
    LIST_UTILS;


    public boolean checkNodes(ListNode node_1, ListNode node_2) {
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

    public ListNode getHeaderNode(int[] values) {

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
