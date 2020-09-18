package ravibraRabulaDS;

//Find the maximum difference between two elements such that larger element appears after the smaller element
public class FindMaxDifference {
	public static int findMax(int [] a) {
		int temp=0;
		int len= a.length;
		for(int i=len-1;i>0;i--) {
			for(int j=i-1;j>=0;j--) {
				int sum=a[i]-a[j];
				if(temp<sum) {
					temp=sum;
				}
			}
		}
		
		return temp;
	}
	public static int maxDiff(int arr[], int n) 
	{ 
	    // Initialize Result 
	    int maxDiff = -1;  
	      
	    // Initialize max element from right side 
	    int maxRight = arr[n-1];  
	  
	    for (int i = n-2; i >= 0; i--) 
	    { 
	        if (arr[i] > maxRight) 
	            maxRight = arr[i]; 
	        else
	        { 
	            int diff = maxRight - arr[i]; 
	            if (diff > maxDiff) 
	            { 
	                maxDiff = diff; 
	            } 
	        } 
	    } 
	    return maxDiff; 
	} 
	  
	public static void main(String[] args) {
		int[] a= {7,9,5,6,3,2};
		int[] a1= {30,10,8,2};
//		int[] a1= {2,3,10,6,4,8,1};
		int n= a1.length;
		System.out.println(findMax(a));
		System.out.println();
		System.out.println(maxDiff(a1, n));
		
	}

}
