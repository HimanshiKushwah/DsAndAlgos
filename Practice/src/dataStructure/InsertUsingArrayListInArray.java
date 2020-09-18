package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertUsingArrayListInArray {
	public static void addElement(Integer[] arr,int pos,int ele) {
          List<Integer> list = new ArrayList<>(Arrays.asList(arr)); 
          
          list.add(pos-1, ele);
          
          arr=list.toArray(arr);
          
          for(Integer a1:arr) {
          System.out.print(a1+" ");
          }
          System.out.println();
          System.out.print(list);
	}
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4,5,6,7,8,9,10};
		addElement(arr,4,100);
	}

}
