package geeksForGeeksCourse;
//Prints All the prime numbers smaller and equal to n
public class MathsEratosthenes {
	public static void main(int n) {
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static boolean isPrime(int n) {
		int count=0;
		if(n==2 || n==3) {
			return true;
		}
		if(n%2==0 || n%3==0) {
			return false;
		}
		for(int i=5;i*i<=n;i+=6) {
			if(n%i==0) {
				count++;

			}
		}
		if(count>0) {
			return false;
		}
		else {
			return true;
		}

	}
	public static void main(String[] args) {
		main(23);

	}

}
