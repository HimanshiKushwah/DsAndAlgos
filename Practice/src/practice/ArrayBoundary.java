package practice;

public class ArrayBoundary {
	public static void printBound(int[][] arr,int r,int c) {
		if(r==1) {
			for(int i=0;i<c;i++) {
				System.out.print(arr[0][i]+" ");
			}
		}
		else if(c==1) {
			for(int i=0;i<r;i++) {
				System.out.print(arr[i][0]+" ");
			}
		}
		
		else {
			for(int i=0;i<c;i++) {
				System.out.print(arr[0][i]+" ");
			}
			for(int i=1;i<r;i++) {
				System.out.print(arr[i][c-1]+" ");
			}
			for(int i=c-2;i>=0;i--) {
				System.out.print(arr[r-1][i]+" ");
			}
			for(int i=r-2;i>0;i--) {
				System.out.print(arr[i][0]+" ");
			}
		}
	}

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		printBound(arr, 3,3);
	}

}
