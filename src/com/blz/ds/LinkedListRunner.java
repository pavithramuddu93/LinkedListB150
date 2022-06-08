package com.blz.ds;

public class LinkedListRunner {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.display();
        linkedList.addLast(56);
        linkedList.addLast(30);
        linkedList.addLast(70);

        linkedList.display();

    }
}