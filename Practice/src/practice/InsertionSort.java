package practice;

public class InsertionSort {
	public static void selectionSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int temp=a[i];
			int j=i;
			while(j>0 && temp<a[j-1]) {
				a[j] = a[j-1];
				j=j-1;
			}
			a[j]=temp;
			System.out.println();
			for(int a1:a) {
				System.out.print(a1+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		int[] a= {7,4,5,2};
		selectionSort(a);
	}

}
