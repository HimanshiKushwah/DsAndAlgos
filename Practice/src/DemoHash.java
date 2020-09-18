import java.util.HashMap;
import java.util.Map;

public class DemoHash {

//	static DemoHash d1 = new DemoHash();
//	static DemoHash d2 = new DemoHash();
	public static void main(String[] args) {
		String s1= new String("A");
		String s2= new String("A");
		
		
		Map<String,Integer> m = new HashMap<>();
		m.put(s1, 50);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(m.get(s1));
		System.out.println(m.get(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(d1==d2);
//		System.out.println(d1.equals(d2));


	}

}
