package ravibraRabulaDS;

public class RotateBy {
//	[1 2 3 4 5] ---> [3 4 5 1 2]
	public static void rotateByRight(int[] nums,int d) {
		while(d>=0) {
			int temp=nums[nums.length-1];
			int i;
			for(i=nums.length-1;i>0;i--) {
				nums[i]=nums[i-1];
				
			}
			
			nums[i]=temp;
			d--;
		}
		for(int a:nums) {
			System.out.print(a+" ");
		}
		
	}
//	[1 2 3 4 5] ---> [4 5 1 2 3]
	public static void rotateByLeft(int[] nums,int d) {
		while(d>=0) {
			int temp= nums[0];
			int i,j=1;
			for(i=0;i<nums.length-1;i++) {
				nums[i]=nums[i+j];
			}
			nums[i]=temp;
			d--;
		}
		for(int a:nums) {
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] a1= {1,2,3,4,5};
		rotateByRight(a, 2);
		System.out.println();
		rotateByLeft(a1, 2);
	}

}
