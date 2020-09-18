package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

class NodeClass1{
	int data;
	NodeClass1 left,right;
	NodeClass1(int data){
		this.data=data;
		left= right = null;
	}
}
public class TreeTraversalTechniques {
	NodeClass1 root;

	void print() {
		if(root == null) {
			System.out.println("Tree is empty");
		}

		Queue<NodeClass1> q =new LinkedList<NodeClass1>() ;
		q.add(root);
		while(!q.isEmpty()) {
			NodeClass1 temp= q.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
	}
	//  PreOrder Traversal
	public void preOrder(NodeClass1 root) {
		if(root== null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);

	}

	//  InOrder Traversal
	public void  inOrder(NodeClass1 root) {
		if(root== null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);

	}

	//  PostOrder Traversal
	public void postOrder(NodeClass1 root) {
		if(root== null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	public static NodeClass1 insert(NodeClass1 root,int data) {
		if(root == null) {
			NodeClass1 n= new NodeClass1(data);
			
		return n;
		}
		
		if(data<root.data) {
			root.left= insert(root.left,data);
		}
		root.right= insert(root.right,data);
		
		return root;

	}
	public static void main(String[] args) {
		TreeTraversalTechniques n = new TreeTraversalTechniques();
		n.root= new NodeClass1(4);
		n.root.left= new NodeClass1(2);
		n.root.right= new NodeClass1(7);
		n.root.left.left = new NodeClass1(3);
		n.root.left.right = new NodeClass1(1);
		n.root.right.left = new NodeClass1(6);
		n.root.right.right = new NodeClass1(9);
		System.out.print("Nodes in a Tree are as follows:- ");
		n.print();
		System.out.println();
		System.out.print("PreOrder Traversal:- ");
		n.preOrder(n.root);
		System.out.println();
		System.out.print("InOrder Traversal:- ");
		n.inOrder(n.root);
		System.out.println();
		System.out.print("PostOrder Traversal:- ");
		n.postOrder(n.root);
		System.out.println(insert(n.root, 10));
	}

}
