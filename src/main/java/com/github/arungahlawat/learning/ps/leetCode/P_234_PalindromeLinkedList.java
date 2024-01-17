package com.github.arungahlawat.learning.ps.leetCode;

import com.github.arungahlawat.learning.dataStructures.helpers.ListNode;

/*
Given the head of a singly linked list, return true if it is a
palindrome or false otherwise.
Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false
Constraints:
The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
Follow up: Could you do it in O(n) time and O(1) space?
 */
public class P_234_PalindromeLinkedList {
    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode first = head;
        ListNode second = head;
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        second = reverseList(first);
        first = head;
        while (second != null) {
            if (first.val != second.val)
                return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }
}
