import java.util.Arrays;
import java.util.Scanner;

public class FindMode {
	 public static int findMode(int arr[],int n){
	        int maxCount = 0,maxValue = 0;
	        
	        for(int i=0;i<n;i++){
	            int count = 0;
	            for(int j=0;j<n;j++){
	                if(arr[i]==arr[j]){
	                    count++;
	                }
	            }
	            
	            if(count>maxCount){
	                maxCount =count;
	                maxValue=arr[i];
	            }
	        }
	        return maxValue;
	    }
	    
	    
	     public static void main(String []args){
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the size of an array");
	        int n= sc.nextInt();
	        int arr[]=new int[n];
	        System.out.println("List of arrays are as follows");
	        for(int i=0;i<n;i++) {
	        	arr[i]= sc.nextInt();
	        }
	        
//	        System.out.println(Arrays.toString(arr));
	        System.out.print("Mode of the array is:-"+ findMode(arr,n));
	     }

	     
}
