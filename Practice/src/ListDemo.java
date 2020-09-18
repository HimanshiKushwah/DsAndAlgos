import java.util.List;
import java.util.ArrayList;

public class ListDemo {
	

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		List<Integer> l= new ArrayList<Integer>();
		l.add(1);
		l.add(4);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.contains(i));
		}
		System.out.println(l.size());
		System.out.println(l);
	}

}
