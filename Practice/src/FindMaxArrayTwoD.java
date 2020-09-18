import java.util.Scanner;

public class FindMaxArrayTwoD {
	
	public static void maxValue(int[][] arr,int r,int c) {
		int len = arr.length,max = 0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		System.out.println(max);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row of array");
		int r= sc.nextInt();
		System.out.println("Enter the column of array");
		int c= sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter the numbers");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		maxValue(a,r,c);
		
	}

}
