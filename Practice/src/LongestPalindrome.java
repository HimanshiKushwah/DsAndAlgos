import java.util.Scanner;

public class LongestPalindrome {
	public static void longestPalindrome(String str) {
		int len=str.length();
		String result="wqwee";
		for(int i=0;i<len;i++) {
			for(int j=len-1-i;j>0;j--) {
				if(str.charAt(i)!=str.charAt(j)) {
					break;
				}
				result+=str.charAt(i);
			}
		}
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String:-");
		String s=sc.nextLine();
		longestPalindrome(s);

	}

}
