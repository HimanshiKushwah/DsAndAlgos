package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeletionInArray {
	public static void deleteAt(Integer[] arr,int index) {
		List<Integer> l =new ArrayList<>(Arrays.asList(arr));
		
		l.remove(index);
		
		arr=l.toArray(arr);
		
		for(Integer i =0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5};
		deleteAt(arr,2);
	}

}
