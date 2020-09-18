import java.util.Scanner;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s= sc.nextLine();
		int len=s.length();
		
		boolean isPalindrome = true;
		for(int i=0;i<len;i++) {
			if(s.charAt(i)!=s.charAt(len-1-i)) {
				System.out.println(s+" is not palindrome");
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println(s+" is palindrome");
		}
	}
}
