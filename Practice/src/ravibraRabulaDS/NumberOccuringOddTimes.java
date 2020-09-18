package ravibraRabulaDS;

import java.util.HashMap;
import java.util.Map;

//Find the number occuring odd number of times in a given array of size 'n'

public class NumberOccuringOddTimes {
	
	public static Map<Integer,Integer> countOdds(int[] nums){
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int num:nums) {
			if(!hm.containsKey(num)) {
				hm.put(num, 1);
			}
			else {
				hm.put(num, hm.get(num)+1);
			}
		}
			return hm;
	}
	public static int oddTimes(int[] nums) {
		Map<Integer,Integer> counts = countOdds(nums);
		Map.Entry<Integer,Integer> entrySet = null;
		for(Map.Entry<Integer, Integer> entry:counts.entrySet()) {
			if(entry.getValue()%2==1) {
				entrySet=entry;
			}
		}
		return entrySet.getKey();
	}
	public static void main(String[] args) {
		int[] arr = {5, 7, 2, 7, 5, 2, 5};
		System.out.println(oddTimes(arr));
	}

}
