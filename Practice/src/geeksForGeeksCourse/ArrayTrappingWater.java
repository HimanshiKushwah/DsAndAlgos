package geeksForGeeksCourse;

public class ArrayTrappingWater {
	public static int trappingWater(int[] arr,int n) {
		int res=0;
		int i;
		for( i=1;i<n-1;i++) {
			int lmax=arr[i];
			for(int j=0;j<i;j++) {
				lmax=Math.max(lmax, arr[j]);
			}
			
			int rmax=arr[i];
			for(int j=i+1;j<n;j++) {
				rmax=Math.max(rmax,arr[j]);
			}
			
			res =res+( Math.min(lmax, rmax)-arr[i]);
		}
		return res;
		
	}
	public static int efficientSol(int[] arr,int n) {
		int res=0;int i;
		int[] lmax=new int[n];
		int[] rmax=new int[n];
		lmax[0]=arr[0];
		for(i=1;i<n;i++) {
			lmax[i]=Math.max(lmax[i-1],arr[i]);
		}
		rmax[n-1]=arr[n-1];
		for(i=n-2;i>=0;i--) {
			rmax[i]=Math.max(rmax[i+1],arr[i]);
		}
		for(i=1;i<n-1;i++) {
			res =res+(Math.min(lmax[i],rmax[i])-arr[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr= {3,0,1,2,5};
		int n=arr.length;
		System.out.println(trappingWater(arr,n));
		System.out.println(efficientSol(arr,n));
	}

}
