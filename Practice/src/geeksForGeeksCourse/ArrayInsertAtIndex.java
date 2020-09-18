package geeksForGeeksCourse;

import java.util.Scanner;

public class ArrayInsertAtIndex {
	public static void insertAtIndex(int arr[],int size,int index,int element) {
		if(index == size-1) {
			arr[size-1]=element;
		}
		else {
			for(int i=size-1;i>index;i--) {
				arr[i]=arr[i-1];
			}
			arr[index]=element;
		}
        for(int a1:arr) {
        	System.out.print(a1+" ");
        }
        
        
	}
	
	public static int median(int a[],int n) {
		if(n/2 == 1) {
			return a[(n-1)/2];
		}
		else {
			return ((int)Math.floor(a[(n-1)/2]+a[(n+1)/2])/2);
		}
	}
	
	public static int mean(int a[],int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		return sum/n;
	}

	public static void main(String[] args) {
		int arr[]= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:-");
		int n= sc.nextInt();
		
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index:-");
		int index=sc.nextInt();
		System.out.println("Enter the element:-");
		int element = sc.nextInt();
		
		insertAtIndex(arr, n, index, element);
		
		System.out.println(mean(arr,n));
		System.out.println(median(arr,n));
	}

}
