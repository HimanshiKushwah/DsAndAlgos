package dataStructure;

public class NewLinkedList {
	
	static Node head;
	
	static class Node{
		int data;
		String s;
		Node next;
		
		Node(int d){
			this.data= d;
			next= null;
			
		}
		
	}
//	Insertion at front
	public static void append(int data) {
		if(head == null) {
			head= new Node(data);
			return;
		}
		Node newOne = new Node(data);
		newOne.next=head;
		head=newOne;
		return;
	}
	
//	Insertion At Last
	public static void appendAtLast(int data) {
		if(head == null) {
			head= new Node(data);
			return;
		}
		Node newOne= new Node(data);
		Node n= head;
		while(n.next!=null) {
			n=n.next;
			
		}
		n.next=newOne;
		newOne.next=null;
	}
	
//	Insertion at given index
	private Node appendAt(int index,Node head,int data) {
		if(index == 0 || head == null) {
			Node temp = new Node(data);
			temp.next= head;
			return temp;
		}
		head.next=appendAt(index-1,head.next,data);
		return head;
	}
	 void appendAt(int index,int data) {
		head=appendAt(index,head,data);
	}
	public static void print() {
		Node n= head;
		while(n!= null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
		
	}
	public static void main(String[] args) {
		NewLinkedList list= new NewLinkedList();
//		head= new Node(1);
//		Node second= new Node(2);
//		Node third = new Node(3);
		
//		head.next= second;
//		second.next=third;
//		print();
		
		append(0);
		System.out.println();
		print();
		
		appendAtLast(4);
		System.out.println();
		print();
		
		appendAtLast(5);
		System.out.println();
		print();
		
		list.appendAt(1,6);
		System.out.println();
		print();
	}

}
