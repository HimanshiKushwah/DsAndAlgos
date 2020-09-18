package geeksForGeeksCourse;

public class ArrayMaxSubArray {
	public static int subArray(int[] arr,int n) {
		int sum=0,count=0;
		for(int i=0;i<n;i++) {
			sum=0;
			for(int j=i;j<n;j++) {
				sum+=arr[j];
			}
			count=Math.max(count, sum);
			
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr= {2,3,-8,7,-1,2,3};
		int n=arr.length;
		System.out.println("Output is"+subArray(arr,n));
	}

}
