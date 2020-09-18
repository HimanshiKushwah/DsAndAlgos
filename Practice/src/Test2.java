
public class Test2  {
	public static void arrayOfArray(int[] arr) {
		int index=0;
		int n=arr.length;
		int j=0;
		int[] temp = new int[n];
		for(int i=0;i<arr.length;i++) {
			j=arr[i];
			temp[index++]=arr[j];
		}
		for(int a1:temp) {
			System.out.print(a1+" ");
		}
	}
	public static void withoutAuxilliary(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			arr[i]=arr[i]+(arr[arr[i]]%n)*n;
		}
		for(int i=0;i<n;i++) {
			arr[i]/=n;
		}
		for(int a1:arr) {
			System.out.print(a1+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr= {4,0,2,1,3};
		arrayOfArray(arr);
		System.out.println();
		withoutAuxilliary(arr);
	}

}
