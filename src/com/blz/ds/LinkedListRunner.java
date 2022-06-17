package com.blz.ds;

public class LinkedListRunner {
    public static void main(String[] args) {
               // 10 ==>20==>30==>40==>50
                LinkedList linkedList = new LinkedList();

                linkedList.addLast(10);
                linkedList.addLast(20);
                linkedList.addLast(30);
                linkedList.addLast(40);
                linkedList.addLast(50);
                linkedList.display();

                linkedList.insertAtSpecificIndex(2, 21);
                linkedList.display();

                linkedList.insertAtSpecificIndex(4, 35);
                linkedList.display();


                linkedList.insertAtSpecificIndex(0, 5);
                linkedList.display();


            }

        }