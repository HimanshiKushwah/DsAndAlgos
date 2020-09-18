package practice;

public class Demo implements Multiply {
	
	public static void main(String[] args) {
	 Demo d= new Demo();
	 d.multiplyTwo(7, 5);
	 d.multiplyThree(2, 3, 4);

	}
	@Override
	public void multiplyThree(int a, int b, int c) {
		int sumOfThree= a*b*c;
		System.out.println(sumOfThree);
		
	}
	
    public void multiplyTwo(int x,int y) {
		int sumOfTwo= x*y;
		System.out.println(sumOfTwo);
	}

}
