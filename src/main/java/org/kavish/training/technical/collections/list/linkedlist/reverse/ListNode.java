package org.kavish.training.usecase.collections.list.linkedlist.reverse;

public class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
