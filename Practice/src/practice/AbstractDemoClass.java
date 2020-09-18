package practice;

abstract class MyClass{
	public abstract void addOne(int a, int b);

	public void methodTwo(int[] a) {
		for(int i:a) {
			System.out.println(i+" ");
		}
	}
}
public class AbstractDemoClass extends MyClass {
	 public void addOne(int a,int b) {
		 int mul= a*b;
		 
		 System.out.println(mul);
	 }
	
   public static void main(String[] agrs) {
	   AbstractDemoClass a= new AbstractDemoClass();
	   int[] a1= {1,2,3,4,5};
	   a.addOne(3, 6);
	   a.methodTwo(a1);
	
   }
}
