package practice;

public class MargeSort {
	public static int[] mergeSortedArray(int[] left,int[] right) {
		int l1=left.length;
		int l2=right.length;
		int[] temp= new int[l1+l2];
		int i=0,j=0,index=0;

		while(i<l1 && j<l2) {
			if(left[i]<right[j]) {
				temp[index++]=left[i++];
			}
			else {
				temp[index++]=right[j++];
			}
		}
		while(i<l1) {
			temp[index++]=left[i++];
		}
		while(j<l2) {
			temp[index++]=right[j++];
		}
		return temp;
	}

	public static void mergeSort(int[] a) {
		if(a.length<=1) {
			return;
		}
		int len= a.length;
		int r=len-1;
		int mid= len-len/2;

		int[] left= new int[mid];
		int[] right=new int[r-mid+1];

		int index=0;
		for(int i=0;i<left.length;i++) {
			left[i]=a[index++];
		}
		for(int i=0;i<right.length;i++) {
			right[i]=a[index++];
		}

		mergeSort(left);
		mergeSort(right);

		int[] temp=mergeSortedArray(left,right);
		index=0;
		
		for(int i=0;i<temp.length;i++) {
			a[index++]=temp[i];
		}
	}
	
	public static void display(int[] a) {
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int[] a= {8,4,5,3,7,2,6,1};
		display(a);
		mergeSort(a);
		System.out.println();
		display(a);

	}

}
