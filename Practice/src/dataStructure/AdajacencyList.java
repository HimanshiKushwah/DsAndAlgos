package dataStructure;
import java.util.LinkedList;

public class AdajacencyList {
	int vertex;
	LinkedList<Integer> list[];
	
	public AdajacencyList(int vertex) {
		this.vertex=vertex;
		list=new LinkedList[vertex];
		for(int i=0;i<vertex;i++) {
			list[i]=new LinkedList<>();
		}
	}
	
	public void addEdge(int source,int destination) {
		list[source].addFirst(destination);
		list[destination].addFirst(source);
	}
	
	public void printAll() {
		for(int i=0;i<vertex;i++) {
			if(list[i].size()>0) {
				System.out.print("vertex "+i+" is conected with:-");
				for(int j=0;j<list[i].size();j++) {
					System.out.print(list[i].get(j)+" ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		AdajacencyList list= new AdajacencyList(6);
		list.addEdge(0, 1);
		list.addEdge(1, 2);
		list.addEdge(1, 3);
		list.addEdge(3, 4);
		list.addEdge(3, 5);
		list.printAll();
	}

}
