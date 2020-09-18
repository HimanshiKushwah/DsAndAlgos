package ravibraRabulaDS;

import java.util.HashSet;

//Algorithm to find two repeating numbers in a given array

//Algorithm to find duplicate elements in O(n) time and O(1) extra space, for a given array of size 'n'
public class TwoRepeatElement {
	public static void twoRepeat(int[] a) {
		HashSet<Integer> hs = new HashSet<>();
		for(int i:a) {
			if(!hs.contains(i)) {
				hs.add(i);
			}
			else {
				System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args) {
		int[] a= {2,1,1,3,4,2};
		twoRepeat(a);
	}
	

}
