
public class Palindrome {

	public static void main(String[] args) {
		String s="121";
		int l=s.length();
		boolean ispalindrome = true;
		for(int i=0;i<l;i++) {
			if(s.charAt(i)!=s.charAt(l-1-i)) {
				System.out.println(s+" is not palindrome");
				ispalindrome= false;
				break;
			}
		}
		if(ispalindrome) {
			System.out.println(s+" is palindrome");
		}
	}

}
