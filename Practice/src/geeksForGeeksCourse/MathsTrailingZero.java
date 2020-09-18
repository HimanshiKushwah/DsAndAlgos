package geeksForGeeksCourse;

import java.util.Scanner;

public class MathsTrailingZero {
	public static int findTraillingZero(int n) {
		int res=0;
		for(int i=5;i<=n;i=i*5) {
			res=res+n/i;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the digit:- ");
		int n = sc.nextInt();
		System.out.println(findTraillingZero(n));
	}

}
