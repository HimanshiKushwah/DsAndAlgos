package geeksForGeeksCourse;

public class MathsPrime {
	public static boolean isPrime(int n) {
		int count=0;
		if(n==1) {
			return false;
		}
		if(n==2 || n==3) {
			return true;
		}
		if(n%2== 0 || n%3 == 0) {
			return false;
		}
		for(int i=5;i*i<=n;i=i+6) {
			if(n%i == 0 || n%(i+2)==0) {
				count ++;
			}
		}
		if(count>0) {
			return false;
		}
		else
			return true;
	}

	public static void main(String[] args) {
		
		System.out.println(isPrime(121));
	}

}
//O(sqrt(n))