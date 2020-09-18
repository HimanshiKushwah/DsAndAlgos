package dataStructure;

import java.util.LinkedList;
import java.util.Queue;
class NodeH{
	int data;
	NodeH right,left;
	NodeH(int key){
		this.data=key;
		right=left=null;
	}
}
	public class TreeHeight {
		static NodeH root;
		void print() {
			if(root==null) {
				System.out.println("There is no element in a tree.");
			}
			Queue<NodeH> queue= new LinkedList<NodeH>();
			queue.add(root);
			while(!queue.isEmpty()) {
				NodeH temp=queue.poll();
				System.out.print(" "+temp.data);
				if(temp.left!=null) {
					queue.add(temp.left);
				}
				if(temp.right!=null) {
					queue.add(temp.right);
				}
			}
		}
		public static int height(NodeH root) {
  	    if(root == null){
              return -1;
          }
         int h1= height(root.left);
         int h2= height(root.right);
         int max= Integer.max(h1,h2)+1;
        return max;
      }


	public static void main(String[] args) {
		TreeHeight t = new TreeHeight();
		t.root= new NodeH(3);
		t.root.left= new NodeH(2);
		t.root.left.left = new NodeH(1);
		t.root.right = new NodeH(5);
		t.root.right.left = new NodeH(4);
		t.root.right.right= new NodeH(6);
		t.root.right.right.right= new NodeH(7);
		
		t.print();
		System.out.println();
		int h= t.height(root);
		System.out.println("height of the tree is "+ h);
		
		
	}

}
