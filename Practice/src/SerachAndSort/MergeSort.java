package SerachAndSort;

import java.util.Scanner;


public class MergeSort {
	public static int[] mergeSortedArray(int[] left,int[] right) {
		int l1=left.length;
		int l2=right.length;
		int temp[]=new int[l1+l2];
		int index=0;
		int i=0,j=0;
		while(i<l1 &&j<l2) {
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
	public static void mergeSort(int[] arr) {
		if(arr.length<=1)
			return;
		int r=arr.length-1;
		int len=arr.length;
		int mid=len-len/2;

		int[] left=new int[mid];
		int[] right=new int[r-mid+1];

		int index=0;
		for(int i=0;i<left.length;i++) {
			left[i]=arr[index++];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=arr[index++];
		}
		mergeSort(left);
		mergeSort(right);

		int result[]=mergeSortedArray(left,right);
		index=0;
		for(int i=0;i<result.length;i++) {
			arr[index++]=result[i];
		}

	}
	public static void display(int[] a) {
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr= {4,3,2,1};
		for(int i:arr) {
			System.out.print(i+" ");
		}
		mergeSort(arr);
		System.out.println();
		display(arr);
	}

}