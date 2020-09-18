package dataStructure;

public class RotateArray {
	public static void rotate(int[] arr, int k) {
		//boolean swap=false;
	
		
		for(int i=0;i<k+1;i++) {
			for(int j=0;j<arr.length;j++) {
				if(j==arr.length-2)
				{
					int v=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=v;
				}
				
				else if(j<arr.length-2)
				{
					int v=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=v;
				}
			
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {-1,-100,3,99};
		rotate(arr,2);
	}

}
