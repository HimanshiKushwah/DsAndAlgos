package dataStructure;

public class RotateArrays {
	public void rotate(int[] nums, int k) {
        if(k==0 || nums.length==k)
            return;
        k = k%nums.length;
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
        show(nums);
    }
    
    public void reverse(int[] nums, int left, int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
             nums[right] = temp;
            left++;
            right--;
        }
        
    }
    public static void show(int[] arr) {
    	for(int a:arr) {
    		System.out.print(a+" ");
    	}
    }
// Second way    
    public static void rotateByK(int[] nums,int k) {
    	int j=0;
    	while(k>0) {
    		int temp= nums[nums.length-1];
    		for(j=nums.length-1;j>0;j--) {
    			nums[j]=nums[j-1];
    		}
    		nums[j]=temp;
    		k--;
    	}
    	for(int a:nums) {
    		System.out.print(a+" ");
    	}
    	
    }
    
    public static void rotateLeft(int[] arr,int k) {
    	int j=0;
    	int len= arr.length;
    	while(k<len) {
    		int temp=arr[len-1];
    		for( j=len-1;j>0;j--) {
    			arr[j]=arr[j-1];
    		}
    		arr[j]= temp;
    		k++;
    		
    	}
    	for(int a:arr) {
    		System.out.print(a+" ");
    	}
    }
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] arr1= {1};
		int[] nums= {1};
		rotateByK(arr, 2);
		RotateArrays r = new RotateArrays();
//		r.rotate(arr,4);
		System.out.println();
		rotateLeft(arr, 2);
		
	}

}
