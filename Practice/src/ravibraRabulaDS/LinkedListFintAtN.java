package ravibraRabulaDS;

public class LinkedListFintAtN<T> {
	
	Node<T> head;
	
	static class Node<T>{
		T data;
		Node<T> next;
		
		 Node(T data){
			this.data=data;
			next= null;
		}
	}
	
	 void insertAtFront(T data) {
		if(head == null) {
			head= new Node<T>(data);
			return;			
		}
		Node<T> newOne = new Node<T>(data);
		newOne.next=head;
		head= newOne;
	}
	 
	 void insertAtLast(T data) {
		 if(head == null) {
			 head= new Node<T>(data);
			 return;
		 }
		 Node<T> newOne = new Node<T>(data);
		 Node<T> n =head;
		 while(n.next!= null) {
			 n= n.next;
		 }
		 n.next=newOne;
		 newOne.next=null;
		 
	 }
	 void insert(T data) {
	 Node<T> n = new Node<T>(data);
		 n.next= head;
		 head=n;
	 }
	 void display() {
		 Node<String> n= (Node<String>) head;
		 while(n!=null) {
			 System.out.print(n.data+" ");
			 n=n.next;
		 }
	 }
	 
	 void printNthFromLast(int n) {
		 int len=0;
		 
		 Node<T> temp = head;
		 while(temp.next!=null) {
			 temp=temp.next;
			 len++;
		 }
		 if(len<n) {
			 return;
		 }
		 temp=head;
		 
		 for(int i=0;i<len-n+1;i++) {
			 temp=temp.next;
			 System.out.println(temp.data);
		 }
	 }
	public static void main(String[] args) {
		LinkedListFintAtN<String> l= new LinkedListFintAtN<>();
//		l.insertAtLast("Gwalior");
//		l.insertAtLast("Kushwah");
//		l.insertAtLast("Himanshi");
//		l.insertAtLast("Miss");
//		l.display();
//		System.out.println();
		l.insert("Mrs");
		l.insert("Asha");
		l.insert("Kushwah");
		l.insert("gwalior");
		l.display();
		System.out.println();
		l.printNthFromLast(3);
		
		



	}

}
