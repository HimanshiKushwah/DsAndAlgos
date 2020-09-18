
public class TestConst {
	
	static int count=0;
	{
		count++;// instance block
	}
	TestConst()
	{}
	TestConst(int i){
		
	}
	public static void main(String[] args) {
		TestConst t1= new TestConst(5);
		TestConst t2 = new TestConst();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(count);

	}

}
