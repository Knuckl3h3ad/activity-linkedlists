package com.example.linkedlist;

public class SingleDriver {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new SinglyLinkedList<>();

        linkedList.addFirst("first");
        linkedList.addFirst("second");
        linkedList.addFirst("third");
        linkedList.addFirst("fourth");
        linkedList.addFirst("fifth");

        System.out.println(linkedList);

        linkedList.addLast("sixth");
        linkedList.addLast("seventh");
        linkedList.addLast("eighth");

        System.out.println(linkedList);

        linkedList.pullFirst();
        linkedList.pullFirst();

        System.out.println(linkedList);

        linkedList.pullLast();
        linkedList.pullLast();

        System.out.println(linkedList);
    }

}
