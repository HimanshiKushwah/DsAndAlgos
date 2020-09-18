package geeksForGeeksCourse;

public class ArrayDelete {
	public static int deleteArray(int[] arr,int n,int x) {
		int i;
		for(i=0;i<n;i++)
			if(arr[i]== x) {
				break;
			}
		if(i<n) {
			n=n-1;
			for(int j=i;j<n;j++) {
				arr[j]=arr[j+1];
			}
		}
		return n;
	}
	public static boolean isSorted(int[] arr,int n) {
		for(int i=0;i<n;i++) 
			for(int j=i+1;j<n;j++) 
				if(arr[j]<arr[i]) {
					return false;

				}
		return true;
	}
	public static boolean efficientSort(int[] arr,int n) {
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

	public static void reverse(int[] arr,int n) {
		int low=0;int high=n-1;
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		for(int a1:arr) {
			System.out.println(a1);
		}
	}

	public static int removeDups(int[] arr,int n) {
		int res=1;
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[res-1]) {
				arr[res]=arr[i];
				res++;
			}
		}
		return res;
	}
	public static void rotateByOne(int[] arr,int n,int d) {
		int i;
		while(d>0) {
			int temp=arr[0];
			for(i=1;i<n;i++) {
				arr[i-1]=arr[i];
			}
			arr[i-1]=temp;
			d--;
		}
		for(int a1:arr) {
			System.out.print(a1+" ");
		}
	}
	public static void rotateElement(int[] arr,int n,int d) {
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
		
		for(int a1:arr) {
			System.out.print(a1+" ");
		}
	}
	public static void reverse(int[] arr,int low,int high) {
		while(low<high) {
			arr[low]=arr[low]^arr[high];
			arr[high]=arr[low]^arr[high];
			arr[low]=arr[low]^arr[high];
			low++;
			high--;
		}
		
	}

	public static void main(String[] args) {
		int[] arr= {10,20,30,30,30,30};
		int n=arr.length;
		//		int[] arr1= {5,3,2,1};
		//		int n=arr.length;
		//		int x=12;
		//		n=deleteArray(arr,n,x);
		//		for(int i=0;i<n;i++) {
		//			System.out.print(arr[i]+" ");
		//		}
		//		System.out.println(isSorted(arr1,arr1.length));
		//		
		//		System.out.println(efficientSort(arr,arr.length));
		//		reverse(arr1,arr1.length);

		n=removeDups(arr, n);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}

		int[] a1= {1,2,3,4,5};
		int len=a1.length;

		rotateElement(a1,len,2);
	}

}
