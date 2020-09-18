package ravibraRabulaDS;

//Algorithm to find the middle node in a linked list
public class FindMidInLinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next= null;
		}
	}
	void add(int data) {
		if(head == null) {
			head= new Node(data);
			return;
		}
		Node newOne= new Node(data);
		newOne.next=head;
		head= newOne;
	}
	
	public void intersectPoint() {
		
	}
	public void printMid() {
		Node pointer_fast=head.next;
		Node pointer_slow=head;
		
		
			while(pointer_fast!= null && pointer_slow!= null) {
				pointer_fast=pointer_fast.next.next;
				pointer_slow=pointer_slow.next;
				
			}
			System.out.println(pointer_slow.data);
		
	}
	void display() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		FindMidInLinkedList f = new FindMidInLinkedList();
		
		f.add(2);
		f.add(3);
		f.add(7);
		f.add(9);
		f.add(1);
		f.display();
		System.out.println();

		f.printMid();
		
	
	}

}
