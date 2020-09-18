package SerachAndSort;

public class SelectionSort {
	public static void selectionSort(int[] a,int n) {
		int min=0;
		for(int i=0;i<n;i++) {
			min=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		System.out.println();
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}

	public static void main(String[] args) {
		int a[]= {7,5,4,2};
		int n=a.length;
		System.out.println("Given Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		selectionSort(a,n);
	}

}
