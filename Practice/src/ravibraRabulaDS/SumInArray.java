package ravibraRabulaDS;

import java.util.HashSet;

//Find a pair in an array of size 'n', whose sum is X

public class SumInArray {
	public static void findPair(int[] arr, int sum) {
		HashSet<Integer> h = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			int temp= sum-arr[i];
			if(h.contains(temp)) {
				System.out.println("Pair with given sum "
	                    + sum + " is (" + arr[i] 
	                            + ", " + temp + ")");
			}
			h.add(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {12,3,4,1,6,9};
		int sum= 16;
		findPair(arr, sum);
	}

}
