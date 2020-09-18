package SerachAndSort;

public class BubbleSort {
	public static void bubbleSort(int[] a) {
		boolean swap=false;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j]^a[j+1];
					a[j]=a[j]^a[j+1];
					swap=true;
				}
			}
			if(swap==false) {
				break;
			}
		}
		
		System.out.println("Sorted array according to bubble sort is as follows");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] a= {5,1,4,2,8};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		bubbleSort(a);
		
	}

}
