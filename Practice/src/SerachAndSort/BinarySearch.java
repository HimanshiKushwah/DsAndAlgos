package SerachAndSort;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int[] a,int l,int h,int num) {
		if(l > h) {
		    return -1;
		}
		;
		int m=l + ((h-l) >>1);
		if(num==a[m]) {
			return m;
		}
		else if(num<a[m]) {
			int h1=m-1;
			return binarySearch(a,l,h1,num);
		}
		else if(num>a[m]) {
			
			int l2=m+1;
			return binarySearch(a,l2,h, num);
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Given list is as follows ");
		int[] a= {2, 3, 4, 10, 40,50};
		int k=a.length-1;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Enter the element to be searched:- ");
		int num=sc.nextInt();
		int l=0,h=k;
		int result=binarySearch(a,l,h,num);
		int value=result+1;
		if(result==-1) {
			System.out.println("Element '"+num+"' does not present in the list");
		}
		else {
			System.out.println("Element '"+num+"' present at index '"+result+"' and position '"+value+"' ");
		}
	}

}
