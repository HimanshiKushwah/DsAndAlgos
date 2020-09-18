package dataStructure;

import java.util.Scanner;

public class LinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	int size;
	LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}


	private class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
			next = null;
		}

	}

	void appendFront(T data) {
		size ++;
		if (head == null) {
			head = new Node<>(data);
			tail = head;
			return;
		}
		Node<T> nn = new Node<>(data);
		nn.next = head;
		head = nn;
	}

	void appendLast(T data) {
		size ++;

		if (head == null) {
			head = new Node<>(data);
			tail = head;
			return;
		}

		tail.next = new Node<>(data);
		tail = tail.next;

	}

	private Node<T> insert(int i, Node<T> head, T data) {
		if (i == 0 || head == null) {
			Node<T> temp = new Node<>(data);
			temp.next = head;
			return temp;
		}
		head.next = insert(i - 1, head.next, data);
		return head;
	}
	void insert(int i, T data) {
		head = insert(i, head, data);
	}

	void printLinkedList() {
		if (head == null) {
			System.out.println("Empty Linked List ");
			return;
		}
		Node<T> temp = head;

		while (temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		LinkedList<Integer> a = new LinkedList<>();
		Scanner sc= new Scanner(System.in);

		ll.printLinkedList();

		ll.appendFront("5");
		ll.appendFront("7");
		ll.printLinkedList();

		ll.appendLast("8");
		ll.appendLast("10");

		ll.printLinkedList();
		System.out.println(ll.size);
		ll.insert(3, "4");
		ll.printLinkedList();
	}

}

