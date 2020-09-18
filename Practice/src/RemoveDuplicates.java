import java.util.Scanner;
//How to remove all duplicates from a given string?
public class RemoveDuplicates {
	static String st="";
	static boolean count[]=new boolean[26];
	public static void removeDuplicate(String str) {
		int len=str.length();
		int i=0;
		for( i=0;i<len;i++) {
			count[str.charAt(i)-'a']=true;
			}
		for(int j=0;j<len;j++) {
			 if(count[str.charAt(j)-'a']==true)
				st+=str.charAt(j);
				count[str.charAt(j)-'a']=false;
			}
			System.out.println(st);
	}
			
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String:- ");
		String s=sc.nextLine();
		removeDuplicate(s);
	}

}
