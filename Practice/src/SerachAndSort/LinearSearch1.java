package SerachAndSort;

import java.util.Scanner;

public class LinearSearch1 {
	public static int findLinear(int[] a, int num) {
		for(int i=0;i<a.length;i++) {
			if(num==a[i]) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Given list is as follows ");
		int[] a= {10, 20, 80, 30, 60, 50, 
				110, 100, 130, 170};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Enter the element to be searched:- ");
		int num=sc.nextInt();
		int value=findLinear(a,num);
		int m=value+1;
		if(value==-1) {
			System.out.println("Element '"+num+"' not present in the list");
		}
		else {
			System.out.println("Element '"+num+"' present in the list at index '"+ value +"' and position '"+m+"'");
		}
	}

}
