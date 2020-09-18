
public class Bifurcate {
	public static void bifurcate(int[] arr) {
		int len=arr.length;
		int arr2[]=new int[len];
		int i;int n=0;
		for(int m=0;m<len;m++) {
			if(arr[m]%2==0) {
				arr2[n]=arr[m];
				n++;
			}
		}
		int j=n;
		for(i=0;i<len;i++) {
			if(arr[i]%2==1) {
				{
					arr2[j]=arr[i];
					j++;
				}
			}
		}	
		for(int b:arr2) {
			System.out.print(b+" ");
		}

	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,23,12,234,432,2343};
		bifurcate(arr);
	}

}
