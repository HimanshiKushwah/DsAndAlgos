package geeksForGeeksCourse;

public class MathsAllDivisor {
//	O(n)
	public static void allDivisor(int n) {
		if(n==0) {
			System.out.print(n+" ");
		}
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}
//	output is not in sorted order O(squareRoot(n))
	public static void allDivide(int n) {
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				if(i!=n/i) {
					System.out.print(n/i+" ");
				}
			}
			
		}
	}
//	output is in sorted order with O(squareRoot(n))
	public static void allDivisorE(int n) {
		int i;
		for(i=1;i*i<n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		while(i>=1) {
			if(n%i==0) {
				System.out.print(n/i+" ");
			}
			i--;
		}
	}
	public static void main(String[] args) {
		allDivisor(1);
		System.out.println();
		allDivide(15);
		System.out.println();
		allDivisorE(15);

	}

}
