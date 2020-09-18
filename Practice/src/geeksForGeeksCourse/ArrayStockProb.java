package geeksForGeeksCourse;

public class ArrayStockProb {
	public static int arrayStock(int[] arr,int start,int end) {
		if(end<=start) {
			return 0;
		}
		int profit=0;
		for(int i=start;i<end;i++) {
			for(int j=i+1;j<=end;j++) {
				if(arr[j]>arr[i]) {
					int curr_profit=arr[j]-arr[i]+
							arrayStock(arr,start,i-1)+
							arrayStock(arr,j+1,end);
					profit=Math.max(curr_profit, profit);
				}
				
			}
		}
		return profit;
	}
	public static int easyStock(int[] arr,int n) {
		
		int profit=0;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				profit+=arr[i]-arr[i-1];
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		int[] arr = {1,5,3,8,12};
		int start=0;int end=arr.length-1;
		System.out.println(arrayStock(arr, start, end));
		System.out.println(easyStock(arr,arr.length));
	}

}
