package ravibraRabulaDS;

public class FindMaximum {

	public static int findMaximum(int[] a) {
		int temp=-1;
		int i=0;
		while(i<a.length) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i] && temp<(j-i) ) {
					temp=j-i;
				}	
			}
			i++;
		}
		return temp;
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		System.out.println(findMaximum(a));

	}

}
