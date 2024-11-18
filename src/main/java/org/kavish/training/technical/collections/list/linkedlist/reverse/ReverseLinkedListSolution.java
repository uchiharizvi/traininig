package org.kavish.training.usecase.collections.list.linkedlist.reverse;

public class ReverseLinkedListSolution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode next = new ListNode(2);
        head.next = next;
        System.out.println(reverseList(head));
        System.out.println(reverseListRecursive(head));
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    private static ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode reversedList = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return reversedList;
    }


}
