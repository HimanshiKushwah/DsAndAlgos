package geeksForGeeksCourse;

public class LeaderInArray {
	
//	O(n^2)
	public static void leader(int[] arr,int n) {
		int i,j;
		for(i=0;i<n;i++) {
			boolean flag=false;
			for(j=i+1;j<n;j++){
				if(arr[i]<=arr[j]) {
					flag=true;
					break;
				}
			}
			if(flag==false)
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void leader2(int[] arr,int n) {
		int curr_leader=arr[n-1];
		System.out.print(curr_leader+" ");
		for(int i=n-2;i>0;i--) {
			if(curr_leader<arr[i]) {
				curr_leader=arr[i];
				System.out.print(curr_leader+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {7,10,4,6,5,2};
		int n= arr.length;
		leader(arr,n);
		System.out.println();
		leader2(arr,n);
	}

}
