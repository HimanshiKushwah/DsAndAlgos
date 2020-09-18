package geeksForGeeksCourse;

public class MathsGCDEuclideanAlgo {
	public static int findGCD(int a,int b) {
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}
			else
				b=b-a;
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(findGCD(1,2));

	}

}
