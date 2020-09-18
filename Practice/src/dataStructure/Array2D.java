package dataStructure;

public class Array2D {
	public static void insertElement(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void snakePattern(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
			else {
				for(int j=arr[i].length-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		int[][] arr= {{0,1,2},{3,4,5},{6,7,8},{9,0,4}};
		insertElement(arr);
		System.out.println();
		snakePattern(arr);
	}

}
