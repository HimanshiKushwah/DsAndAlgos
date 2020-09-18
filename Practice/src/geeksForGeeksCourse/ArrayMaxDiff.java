package geeksForGeeksCourse;

public class ArrayMaxDiff {
	public static void maxEff(int[] arr,int n) {
		int res=arr[1]-arr[0];
		int minVal=arr[0];
		for(int j=1;j<n;j++) {
			res=Math.max(res,arr[j]-minVal);
			minVal=Math.min(minVal,arr[j]);
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		int[] arr= {30,10,8,2};
		int n= arr.length;
		maxEff(arr,n);

	}

}
