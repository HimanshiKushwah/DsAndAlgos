import java.util.Scanner;
//How to remove all duplicates from a given string?
public class NewString {
	static String st="";
	static int count[]=new int[26];
	public static void removeDuplicate(String str) {
		int len=str.length();
		for(int i=0;i<len;i++) {
			count[str.charAt(i)-'a']++;
			if (count[str.charAt(i)-'a'] == 1)
			{
				st=st+str.charAt(i);	
			}
		}
		System.out.print(st);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String:- ");
		String s=sc.nextLine();
		removeDuplicate(s);
	}

}