import java.util.Scanner;
//How to find the maximum occurring character in given String?
public class MaxOccurCharacter {
	static char range=256;
	static char[] count= new char[range];
	public static void mostOccur(String str) {
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
	}

	public static void findChar(String str) {
		int index=0;
		char character=0;
		mostOccur(str);
		for(int i=0;i<str.length();i++) {
			if(count[str.charAt(i)]>index) {
				index=count[str.charAt(i)];
				character=str.charAt(i);
			}
		}
		System.out.println("Maximum occured character is '"+character+"' which occured "+index+" times");
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String:-");
		String str= sc.nextLine();
		findChar(str);
	}

}
