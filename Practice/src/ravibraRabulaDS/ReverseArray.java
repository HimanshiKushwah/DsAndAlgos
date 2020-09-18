package ravibraRabulaDS;

public class ReverseArray {
	public static void reverseArray(int[] a) {
		int len = a.length/2;
		
		for(int i=0;i<len;i++) {
			boolean swap=false;
			for(int j=a.length-1-i;j>len;j--) {
				if(swap== false) {
					a[i]=a[i]^a[j];
					a[j]=a[i]^a[j];
					a[i]=a[i]^a[j];
					swap=true;
				}
			}
		}
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		reverseArray(a);
	}

}
