package com.blz.ds;

public class LinkedList {

    Node head;

    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }

    }

    public void addFirst(Object data)
    {
        Node newNode = new Node(data);

        if(head == null)
            head=newNode;
        else
        {
            Node temp = head;
            head = newNode;
            head.next = temp;

        }
    }





    public void display() {
        /*
         * []==> No elements to display.. head==> temp=>[10 | null] [10 | ref20]
         * ==> [20 | ref 30] ==> [30 | null]
         */

        if (head == null)
            System.out.println("No elements to display..");
        else if (head.next == null)
            System.out.println(head.data);
        else {
            Node temp = head;
            //  10==>20==>30==>40=> 50=>==>null
            while (temp!= null) {
                System.out.println(temp.data);
                temp = temp.next;
            }

        }

    }

}


