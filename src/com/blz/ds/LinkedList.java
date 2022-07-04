package com.blz.ds;

public class LinkedList {

	Node head; // null

	class Node {
		Object data; // int, double,long....etc
		Node next;

		public Node(Object data) { // constructor
			this.data = data;
		}

	}

	public void addFirst(Object data) {
		Node newNode = new Node(data); // Creating new node

		if (head == null)
			head = newNode; // linked list is empty then add directly
		else {
			Node temp = head; // it not empty copy to temp node
			head = newNode;
			head.next = temp;
		}

	}

	public void display() {

		if (head == null) {
			System.out.println("No elements to display");
		} else if (head.next == null)
			System.out.println(head.data);

		else {
			Node temp = head;
			while (temp != null) {
				if (temp.next != null)
					System.out.print(temp.data + "->");
				else
					System.out.println(temp.data + "\n");

				temp = temp.next;
			}
		}
	}

}