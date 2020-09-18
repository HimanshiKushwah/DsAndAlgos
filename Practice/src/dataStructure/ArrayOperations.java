package dataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
	public static void insertAtK(int[] a,int x,int pos, int n) {
		int i;
		int[] temp = new int[n+1];
		for(i=0;i<n+1;i++) {
			if(i<pos-1) {
				temp[i]=a[i];
			}
			else if(i == pos-1) {
				temp[i]=x;
			}
			else {
				temp[i]=a[i-1];
			}
		}
		for(int a1:temp) {
			System.out.print(a1+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= {1,2,3,4,5};
		int n= arr.length;
		insertAtK(arr,100,1,n);

	}

}
//2 3 4 5 _ _ _