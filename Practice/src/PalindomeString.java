
import java.util.Scanner;
public class PalindomeString
{
	public static void checkPalindrome(String s) {
		String str="";
		for(int i=s.length()-1;i>=0;i--) {
			str+=s.charAt(i);
		}
		if(s.equals(str)) {
			System.out.println(s+" is palindrome");
		}
		else {
			convertString(s,str);
		}
	}
	
	public static void convertString(String s,String str) {
		char [] original= new char[s.length()];
		for(int i=0;i<s.length();i++) {
			original[i]+=s.charAt(i);
		}
		System.out.println(original);
		char[] newOne = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			newOne[i]+=str.charAt(i);
		}
		System.out.println(newOne);
		int len = original.length;
		int[] result=new int[len];
		for(int i=0;i<len;i++) {
			result[i]+=original[i]+newOne[i];
			
		}
		System.out.println(result.toString());
		
	}

	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
//		System.out.println("Enter the String");
		String s = "7325";
		checkPalindrome(s);
	}
}