package dataStructure;

public class LinkedListTest {
	Node head;
	Node tail;
	int size;

	public LinkedListTest() {
		head=null;
		tail=null;
		size=0;
	}
	public class Node{
		String data;
		Node next;
		Node( String data){
			this.data=data;
			next=null;
		}
	}
	void appendFront(String data) {
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

	void appendLast(String data) {
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
	private Node insert(int index,Node head,String data) {
		if(index==0 || head==null) {
			Node temp= new Node(data);
			temp.next=head;
			return temp;
		}
		head.next=insert(index-1, head.next, data);
		return head;
	}
	void insert(int index,String data) {
		head=insert(index,head,data);
	}
	private Node deleteAtFront() {
		if(head==null) {
			System.out.println("List is empty");
		}
		head=head.next;
		return head;
	}
	public static void main(String[] args) {
		LinkedListTest t= new LinkedListTest();
		t.printAll();
		t.appendFront("Kushwah");
		t.appendFront("Miss");
		

		t.printAll();
		t.insert(1, "Himanshi");
		t.appendLast("Ankit");
		t.appendLast("Kushwah");
		t.printAll();
		t.deleteAtFront();
		t.printAll();
	}

}
