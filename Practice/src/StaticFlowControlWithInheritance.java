
public class StaticFlowControlWithInheritance {
	static int i=0;//1 and 12
	//	Static block
	static { //2
		methodOne();//8 13
		System.out.println("First Static block");//10,15
	}
	public static void main(String[] args) {//3
		methodOne();//13
		System.out.println("main method");//15
	}
	public static void methodOne() {//4
		System.out.println(j);//9, 14
	}
	static int j=20;//5,16
}

class Derived extends StaticFlowControlWithInheritance{
	static int x=100;//6,17
	static {//7
		methodTwo();//18
		System.out.println("Derived first Static block");//20
	}
	public static void main(String[] args) {//8
		methodTwo();//23
		System.out.println("Derived main");//25
	}
		public static void methodTwo(){//9,24
			System.out.println(y);//19
		}
		static {//10
			System.out.println("Derived Second static block");//21
		}
		static int y=700;//11,22
	
}

//Steps how the above program will resolve
//1.Identification of static members from top to bottom[1 to 11]
//2.Execution of static variable assignment and static blocks from top to bottom[12 to 22]
//3.Execution of main methods[23 to 25]
