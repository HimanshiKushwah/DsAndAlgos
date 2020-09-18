package ravibraRabulaDS;



public class ReverseLinkedList {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void display() {
		Node n= head;
		if(n ==  null) {
			System.out.println("Empty List");
		}
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public void displayReverse(Node head) {
		Node n=head;
		if(n ==  null) {
			System.out.println("Empty List");
		}
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public Node reverseList() {
		Node current= head;
		Node previous = null;
		Node next =  null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
	}
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head= new Node(1);
		list.head.next= new Node(2);
		list.head.next.next= new Node(3);
		list.head.next.next.next= new Node(4);
		list.head.next.next.next.next= new Node(5);
		list.display();
		System.out.println();
		list.displayReverse(list.reverseList());
	}

}
