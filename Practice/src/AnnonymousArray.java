
public class AnnonymousArray {

	public static void main(String[] args) {
		sum(new int[] {10,20,30}); //here is the use of annonymous array using new operator and int[] i.e array without name
//		mul(new int[][] {{1,2,3},{2,3,4}});
		Runnable [] r= new Runnable[5];
		
		String[] s = {"a","aa","aaa"};
		System.out.println(s.getClass().getName());
		Object[] o = new Object[5];
		System.out.println(o.getClass().getName());
		r[0]= new Thread();
		System.out.println(r.length);
		System.out.println(r);
	}
	public static void sum(int[] x) {
		int sum=0;
		for(int x1:x) {
			sum=sum+x1;
		}
		System.out.println(sum);
	}
	
}
