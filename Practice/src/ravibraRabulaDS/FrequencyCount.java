package ravibraRabulaDS;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

	public static void frequencycount(int arr[], int n)
    {
       int[] frequency= new int[n];
       int temp=0;
       for(int i=0;i<n;i++){
           temp=arr[i];
           frequency[temp-1]++;
       }
       for(int t: frequency) {
    	   System.out.print(t+" ");
       }
       
    }
	
	    public static void frequencycountGeekySolution(int arr[], int n)
	    {
	        for (int j =0; j<n; j++) 
	            arr[j] = arr[j]-1; 
	        
	        // storing the frequency of elements using mathematical formula
	        for (int i=0; i<n; i++) 
	            arr[arr[i]%n] = arr[arr[i]%n] + n; 

	        for (int i =0; i<n; i++) 
	            arr[i] = (arr[i]/n);
	        
	        for(int t: arr) {
	     	   System.out.print(t+" ");
	        }
	    }
	
	
	
	public static void main(String[] args) {
		int[] a= {2,3,2,3,5};
		frequencycount(a,a.length);
		int[] arr = {1,4,5,4,5};
		System.out.println();
		frequencycountGeekySolution(arr,arr.length);
	}

}
