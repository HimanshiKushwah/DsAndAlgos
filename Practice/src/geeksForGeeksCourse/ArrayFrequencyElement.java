package geeksForGeeksCourse;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequencyElement {
	public static void findFrequency(int[] arr,int n) {
		Map<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else {
				hm.put(arr[i], 1);
			}

		}

		Map.Entry<Integer,Integer> majorityEntry = null;
		for(Map.Entry<Integer,Integer> entry:hm.entrySet()) {

			System.out.println(entry);

		}
	}
	
	public static void frequency(int[] arr,int n) {
		int freq=1,i=1;
		while(i<n) {
			while(i<arr.length && arr[i]==arr[i-1]) {
				freq++;
				i++;
			}
			System.out.println("Frequency of "+arr[i-1]+" is "+freq);
			i++;freq=1;
		}
	}

	public static void main(String[] args) {
		int[] arr= {10,10,10,25,30,30};
		int[] a= {2,2,3,4,5,1,1,1,1};
		int n= arr.length;
		findFrequency(arr, n);
		frequency(a,a.length);
	}

}
