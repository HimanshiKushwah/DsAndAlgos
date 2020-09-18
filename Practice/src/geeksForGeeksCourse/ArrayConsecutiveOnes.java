package geeksForGeeksCourse;

public class ArrayConsecutiveOnes {
	public static int consecutive(int[] arr,int n) {
		int res=0;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=i;j<n;j++) {
				if(arr[j]== 1) {
					count++;
				}
				else {
					break;
				}
			}
			res=Math.max(count,res);
		}
		return res;
	}
	
	public static int cons(int[] arr,int n) {
		int res=0;int count=0;
		int i;
		for(i=0;i<n;i++) {
			
			if(arr[i]==0) {
				count=0;
			}
			else {
				count++;
			}
			res=Math.max(res,count);
			}
		
		return res;
	}
	public static void main(String[] args) {
		int[] arr= {0,1,1,1,0,1,1};
		int n= arr.length;
		System.out.println(cons(arr,n));

	}

}
