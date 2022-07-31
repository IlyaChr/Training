package com.ilyachr.reverselinkedlist;

import com.ilyachr.utils.ListNode;

/**
 * 206. Reverse Linked List
 */
public class ReverseLinkedList {


    public ListNode reverseList(ListNode head) {

        ListNode currentNode = head;

        ListNode newCurrentTailNode = null;

        while (currentNode != null){
            ListNode newPrevCurrentTailNode = newCurrentTailNode;
            newCurrentTailNode = new ListNode(currentNode.val);
            newCurrentTailNode.next = newPrevCurrentTailNode;
            currentNode = currentNode.next;
        }


        return newCurrentTailNode;
    }



}
