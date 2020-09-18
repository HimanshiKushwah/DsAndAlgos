package linkedListDS;

//This program contain insertion and deletion at start,end and at specific
//position and reversal of a linkedlist.

import linkedListDS.LinkedList.Node;

class LinkedList{
	static Node head;

	 static class Node{
		int data; 
		Node next;

		Node(int data){
			this.data = data;
			next= null;
		}
	}

	public void insertAtFront(int data){
		if(head == null){
			head = new Node(data);
		}
		else{
			Node newOne = new Node(data);
			newOne.next=head;
			head= newOne;
		}
	}

	public void insertAtLast(int data){
		if(head == null){
			head= new Node(data);
		}
		else{
			Node newOne = new Node(data);
			Node n=head;
			while(n.next!=null){
				n=n.next;
			}
			n.next=newOne;
			newOne=null;
		}
	}


	public void insertAtN(int index,int data){
		Node newOne = new Node(data);
		Node temp= head;
		int count=1;
		while(count<index-1){
			temp=temp.next;
			count++;
		}
		Node current = temp.next;
		newOne.next=current;
		temp.next=newOne;
	}

	public void display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public void deleteFront() {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node temp= head;
			head = temp.next;
		}
	}

	public void deleteAtLast() {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node previous=head;
			Node current=head.next;
			while(current.next!=null) {
				current=current.next;
				previous=previous.next;
			}
			current=previous;
			current.next=null;
		}
	}
	
	public void deleteAtK(int k) {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node pre = head;
			Node curr = head.next;
			Node currNext = head.next.next;
			
			int count=1;
			if(k<1) {
				deleteFront();
			}else {
			while(count<k) {
				pre=pre.next;
				curr=curr.next;
				currNext = currNext.next;
				count++;
			}
			pre.next=currNext;
			}
		}
	}
	
	public Node reverseList(Node head) {
		if(head==null) {
			return head;
		}
		Node curr=head;
		Node pre=null;
		Node currNext=null;
		while(curr!=null) {
			currNext=curr.next;
			curr.next=pre;
			pre=curr;
			curr=currNext;
		}
		return pre;
	}
	
	public void displayAll(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
}


public class LinkedListOperations{

	public static void main(String []args){
		LinkedList list = new LinkedList();
		list.head= new Node(10);
		list.head.next= new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		list.display();
		//       list.insertAtFront(90);
		//       list.display();
		//       list.insertAtLast(100);
		//       list.display();
		//       list.insertAtN(3, 70);
		//       list.deleteFront();
		//       System.out.println();
		//       list.display();
		System.out.println();
//		list.deleteAtLast();
//		list.deleteAtK(0);
		Node reverList=list.reverseList(list.head);
		list.displayAll(reverList);
	}
}
