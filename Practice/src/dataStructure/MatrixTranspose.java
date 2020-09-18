package dataStructure;

public class MatrixTranspose {
	public static void transpose(int[][]arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp= arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] arr= {{1,1,1},{2,2,2},{3,3,3}};
		int n=3;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*******************************************");
		transpose(arr,3);
	}

}
