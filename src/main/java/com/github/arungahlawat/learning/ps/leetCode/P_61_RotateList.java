package com.github.arungahlawat.learning.ps.leetCode;

import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;

/*
Given the head of a linked list, rotate the list to the right by k places.
Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Example 2:
Input: head = [0,1,2], k = 4
Output: [2,0,1]

Constraints:
The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109
 */
public class P_61_RotateList {
    private ListNode reverse(ListNode head, int k) {
        if (head == null || head.next == null || k==1)
            return head;
        ListNode current = head;
        ListNode prev = null;
        int counter = 0;
        while (current != null && (k == 0 || counter < k)) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            counter++;
        }
        if (current != null && prev != null){
            ListNode tail = prev;
            while (tail.next!= null){
                tail = tail.next;
            }
            tail.next = current;
        }
        return prev;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k <= 0)
            return head;
        ListNode pointer = head;
        int listSize = 0;
        while (pointer != null) {
            listSize++;
            pointer = pointer.next;
        }
        k = k % listSize;
        if (k == 0)
            return head;
        head = reverse(head, 0);
        head = reverse(head, k);

        int counter = 1;
        pointer = head;
        while (counter < k) {
            pointer = pointer.next;
            counter++;
        }
        pointer.next = reverse(pointer.next, 0);
        return head;
    }
}
