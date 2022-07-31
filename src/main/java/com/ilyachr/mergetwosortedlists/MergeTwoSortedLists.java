package com.ilyachr.mergetwosortedlists;

import com.ilyachr.utils.ListNode;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            boolean isList1 = list1.val < list2.val;
            ListNode newListNode = new ListNode(isList1 ? list1.val : list2.val);
            if (isList1) {
                newListNode.next = mergeTwoLists(list1.next, list2);
            } else {
                newListNode.next = mergeTwoLists(list2.next, list1);
            }
            return newListNode;
        }
        if (list2 != null) {
            ListNode listNode = new ListNode(list2.val);
            if (list2.next != null) {
                listNode.next = mergeTwoLists(null, list2.next);
            }
            return listNode;
        }
        if (list1 != null) {
            ListNode listNode = new ListNode(list1.val);
            if (list1.next != null) {
                listNode.next = mergeTwoLists(list1.next, null);
            }
            return listNode;
        }
        return null;
    }


}
