package dataStructure;

import java.util.Queue;
import java.util.LinkedList;

class Node{
	int data;
	Node right,left;
	Node(int key){
		this.data=key;
		right=left=null;
	}
}

public class BinaryTree {
	Node root;
	int countAllNodes() {
		int count=0;
		if(root==null) {
			return count;
		}
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp=queue.poll();
			if(temp!=null) {
				count++;
			}
			if(temp.left!=null) {
				queue.add(temp.left);

			}
			if(temp.right!=null) {
				queue.add(temp.right);

			}
		}
		return count;
	}
	int countFullNodes() {
		int count=0;
		if(root==null) {
			return count;
		}
		Queue<Node> queue= new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp=queue.poll();

			if(temp.left!=null && temp.right!=null) {
				count++;
			}

			if(temp.left!=null) {
				queue.add(temp.left);
			}
			if(temp.right!=null) {
				queue.add(temp.right);
			}
		}
		return count;
	}
	void print() {
		if(root==null) {
			System.out.println("There is no element in a tree.");
		}
		Queue<Node> queue= new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp=queue.poll();
			System.out.print(" "+temp.data);
			if(temp.left!=null) {
				queue.add(temp.left);
			}
			if(temp.right!=null) {
				queue.add(temp.right);
			}
		}
	}
	void flipFlop() {
		if(root==null) {
			System.out.println("There is no element in a tree.");
		}
		Queue<Node>que= new LinkedList<Node>();
		que.add(root);
		while(!que.isEmpty()) {
			Node temp=que.poll();
			if(temp.left!=null && temp.right!=null) {
				int box=temp.left.data;
				temp.left.data=temp.right.data;
				temp.right.data=box;
			}
			if(temp.left!=null) {
				que.add(temp.left);
			}
			if(temp.right!=null) {
				que.add(temp.right);
			}
		}
		System.out.println();
		print();
	}
	

	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(4);
		tree.root.left=new Node(2);
		tree.root.right=new Node(7);
		tree.root.left.left=new Node(1);
		tree.root.left.right=new Node(3);
		tree.root.right.left=new Node(6);
		tree.root.right.right= new Node(9);
		System.out.println("Total no of Nodes are "+tree.countAllNodes());
		System.out.println("Total no of full nodes are "+tree.countFullNodes());
		tree.print();
		tree.flipFlop();

	}

}
