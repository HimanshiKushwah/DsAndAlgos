import java.util.Scanner;

//Reverse and add the string until we get palindrome
public class AddPalindrome {
	static int count=0;
	public static void reverse(int n) {
		int org=n;int temp=0;
		while(n!=0) {
			int rev=n%10;
			temp=temp*10+rev;
			n=n/10;
		}
		if(org!=temp) { 
			count++;
			n=org+temp;
			reverse(n);
		}
		else {
			System.out.println("No of iteration:- "+count);
			System.out.println("Final palindrome is "+temp);
		}
	}
	
	public static void main(String[] args) {
		Object o = new Object();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		reverse(n);
	}

}
