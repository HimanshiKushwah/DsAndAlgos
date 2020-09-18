package LeetCodeChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class MaximizeProfit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int t= sc.nextInt();
		while(t-->0) {
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("Enter elements");
		int[] arr= new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-2;
		int cost=0;
		while(i<j) {
			cost+=arr[j];
			j-=2;
			i++;
		}
		
		System.out.print("Maximum Profit is:-"+cost);
		System.out.println();
	}
	}
}
