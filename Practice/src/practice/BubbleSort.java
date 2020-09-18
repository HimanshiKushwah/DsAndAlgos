package practice;

public class BubbleSort {
	public static void bubbleSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					a[i]=a[i]^a[j];
					a[j]=a[i]^a[j];
					a[i]=a[i]^a[j];
				}
			}
		}
	}
	public static void display(int[] a) {
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
	int[] a= {5,4,3,2,1,0};
	bubbleSort(a);
	display(a);
	}

}
