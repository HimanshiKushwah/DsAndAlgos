package geeksForGeeksCourse;
import static java.lang.Math.floor;
import static java.lang.Math.log10;;
public class MathsCountNum {
	public static void iterativeSol(int n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
	
	public static int recursiveSol(int n) {
		if(n==0) 
			return 0;
			return 1+recursiveSol(n/10);
		
	}
	public static int logrithmicSol(long n) {
		return (int) floor(log10(n)+1);
	}
	public static void main(String[] args) {
		int n=123;
		int n1=4567;
		iterativeSol(n);
		System.out.println(recursiveSol(n1));
	}

}
