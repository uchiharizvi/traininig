package org.kavish.training.utils;


public class ListUtils {
    public static Node addNode(Position position, Node head, int data) {
        switch(position) {

        }
        Node node = new Node(data);
        node.next = head;
        head = node;
        return head;
    }

    public static void removeNode() {

    }

    public static void peek() {

    }
}
