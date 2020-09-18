package geeksForGeeksCourse;

public class MathsPowerOfNum {
	public static void powerNum(int n,int pow) {
		int sum=1;
		while(pow>0) {
			sum=sum*n;
			pow--;
		}
		System.out.print(sum+" ");
	}
	public static int efficientSolution(int n,int pow) {
		if(pow==0) {
			return 1;
		}
		int temp=efficientSolution(n, pow/2);
		temp=temp*temp;
		if(pow%2==0) {
			return temp;
		}
		else
			return temp*n;
	}
	public static void main(String[] args) {
		powerNum(3, 4);
		System.out.println();
		System.out.println(efficientSolution(2, 4));
	}

}
