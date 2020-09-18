
public class StaticControlFlow {
	static int i=0;//1 and 7
	//	Static block
	static { //2
		methodOne();//8
		System.out.println("First Static block");//10
	}
	public static void main(String[] args) {//3
		methodOne();//13
		System.out.println("main method");//15
	}
	public static void methodOne() {//4
		System.out.println(j);//9,14
	}
	static {//5
		System.out.println("Second static block");//11
	}
	static int j=20;//6,12
}

//Steps how the above program will resolve
//1.Identification of static members from top to bottom
//2.Execution of static variable assignment and static blocks from top to bottom
//3.Execution of main methods