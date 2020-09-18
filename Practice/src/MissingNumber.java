import java.util.Scanner;

public class MissingNumber {
	
		public void missingNumber(int[]a,int n) {
			int sum =0;
			for(int i=0;i<n;i++) {
				sum=sum+a[i];
			}
			System.out.println(sum);
		}
	public static void main(String[] args) {
		MissingNumber m= new MissingNumber();
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of an array");
		int n= sc.nextInt();
		int[] a = new int[n];
		System.out.println("List of array are as follow:-");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		m.missingNumber(a,n);
	}

}
