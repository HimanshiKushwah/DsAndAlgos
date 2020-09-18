import java.io.*; 
public class StringToInt {
	public static int stringToInt(String str) {
		int val=0;
		try {
			val=Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid String"); 
		}
		return val;
	}
	public static void main(String[] args) {
		String str="";
		str="1234";
		int val=stringToInt(str);
		System.out.println(val);
		
		 str="123s";
		val=stringToInt(str);
		System.out.println(val);
	}

}
