import java.util.Scanner;
//Find the sum of all possible pairs in an array of N elements
public class SumOfPairs {
	
	public static int possiblePair(int a[],int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sum =sum+ a[i]+a[j];
			}
		}
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Size of array");
		int n= sc.nextInt();
		int a[]=new int[n];
		System.out.println("list of arrays");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(a.getClass().getName());
//		System.out.println((possiblePair(a,n)));
	}

}
