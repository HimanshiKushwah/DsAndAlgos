import java.util.Scanner;

public class CountTriplets {
		public static boolean triplets(int[]a,int n,int value) {
			int sum=0,count=0;
			for(int i=0;i<n;i++) {
				 count=0;
				for(int j=1;j<n;j++){
					for(int k=j+1;k<n;k++) {
						sum=a[i]+a[j]+a[k];
						if(sum == value) {
							return true;
						}
					}
				}
			}
			
			return false;
		
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("List of array given below:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the value:- ");
		int value=sc.nextInt();
	System.out.println(triplets(a,n,value));
	}

}
