package dataStructure;

import java.util.Scanner;

import dataStructure.LinkedListTest.Node;

public class LinkedListTest1 {
	Node head;
	Node tail;
	int size;

	public LinkedListTest1() {
		head=null;
		tail=null;
		size=0;
	}
	public class Node{
		int data;
		Node next;
		Node( int data){
			this.data=data;
			next=null;
		}
	}
	void appendFront(int data) {
		size++;
		if(head==null) {
			head= new Node(data);
			tail=head;
			return;
		}
		Node newOne= new Node(data);
		newOne.next=head;
		head=newOne;
	}

	void appendLast(int data) {
		size++;
		if(head==null) {
			head=new Node(data);
			tail=head;
			return;
		}
		tail.next= new Node(data);
		tail=tail.next;
	}
	void printAll() {
		if(head == null) {
			System.out.println("Linked List is empty");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	private Node insert(int index,Node head,int data) {
		if(index==0 || head==null) {
			Node temp= new Node(data);
			temp.next=head;
			return temp;
		}
		head.next=insert(index-1, head.next, data);
		return head;
	}
	void insert(int index,int data) {
		head=insert(index,head,data);
	}
	private Node delete(int value) {
		if(head==null) {
			System.out.println("List is empty");
		}
		Node temp=head,prev=null;
		if(temp!=null && temp.data==value) {
			head=temp.next;
			return head;
		}
		while(temp!=null && temp.data != value) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
		return temp;
	}
	public static void main(String[] args) {
		LinkedListTest1 t= new LinkedListTest1();
		//		Scanner sc= new Scanner(System.in);
		//		System.out.println("Enter the size of linked List");
		//        int t1 = sc.nextInt();
		//        int x;
		//        Node head=null;
		//        while(t1-- > 0){
		//            x = sc.nextInt();
		//            t.insert(0,head, x);
		//        }
		t.appendFront(4);
		t.appendLast(5);
		t.appendLast(1);
		t.appendLast(2);
		t.printAll();
		t.insert(2,3);
		t.printAll();
		t.delete(1);
		t.printAll();


	}

}
