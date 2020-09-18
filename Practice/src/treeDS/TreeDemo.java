package treeDS;

class Node{
	int data;
	Node left,right;

	Node(int data){
		this.data=data;
		left= null;
		right=null;
	}
}

class BinaryTree{
 Node root;
 BinaryTree(int data){
	 root= new Node(data);
 }
 
 BinaryTree(){
	 root=null;
 }
}


public class TreeDemo {
	
	public static void main(String[] args) {
		BinaryTree b= new BinaryTree();
		b.root=new Node(1);
		b.root.left= new Node(2);
		b.root.right= new Node(3);
	}

}
