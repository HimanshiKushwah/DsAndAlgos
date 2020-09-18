package dataStructure;

public class Matrix90Degree {
	public static void printMatrix(int[][]arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void transpose(int[][]arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		printMatrix(arr, n);
		System.out.println("*******************************");
		reverse(arr, n);
	}
	public static void reverse(int[][]arr, int n) {
		for(int i=0;i<n;i++) {
			int low=0;int high=n-1;
			while(low<high) {
				int temp=arr[low][i];
				arr[low][i]=arr[high][i];
				arr[high][i]=temp;
				low++;
				high--;
			}
		}
		printMatrix(arr, n);
	}
	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int n=4;
		System.out.println("Given Matrix:-");
		printMatrix(arr, n);
		System.out.println("*******************************");
		transpose(arr,n);
		
		
	}

}
