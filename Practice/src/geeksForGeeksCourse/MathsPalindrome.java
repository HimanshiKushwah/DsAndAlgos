package geeksForGeeksCourse;

public class MathsPalindrome {
	public static boolean palindrome(int n) {
		int temp =n;
		int rev=0;
		int tempRem=0;
		while(temp!=0) {
			tempRem=temp%10;
			rev=rev*10+tempRem;
			temp=temp/10;
		}
		if(rev == n) {
			return true;
		}
		else
			return false;
			
	}

	public static void main(String[] args) {
		System.out.println(palindrome(121));
	}

}
