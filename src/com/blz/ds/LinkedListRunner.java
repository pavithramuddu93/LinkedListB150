package com.blz.ds;

public class LinkedListRunner {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.display();
        linkedList.addFirst(70);
        linkedList.addFirst(30);
        linkedList.addFirst(56);

        linkedList.display();

    }
}