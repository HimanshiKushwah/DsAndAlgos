package ravibraRabulaDS;

import java.util.HashSet;

public class FindTriplet {
//Brute Force Time Complexity O(n^3) Auxiliary Space O(1)
	public static void findTriplet(int[] a,int sum) {
		int n= a.length;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(a[i]+a[j]+a[k]== sum) {
						System.out.print(a[i]+","+a[j]+","+a[k]);
					}
				}
			}
		}
	}
	
	public static void findByHashing(int[] a, int sum) {
		int n= a.length;
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int temp=sum-(a[i]+a[j]);
				if(hs.contains(temp)) {
					System.out.printf( 
	                        "%d %d %d\n", temp, a[i], a[j]); 
				}
				else {
					hs.add(a[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a= {12,3,4,1,6,9};
		int[] a1= {0, -1, 2, -3, 1};
		int sum=24;
		int sum1=-2;
		findTriplet(a, sum);
		System.out.println();
		findByHashing(a1, sum1);
	}

}
