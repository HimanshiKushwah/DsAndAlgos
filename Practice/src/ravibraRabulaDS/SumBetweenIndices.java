package ravibraRabulaDS;

public class SumBetweenIndices {
	public static void findSum(int[] a,int sum) {
		int j;
		for(int i=0;i<a.length;i++) {
			int sum1=a[i];
			for(j=i+1;j<a.length;j++) {
				if(sum1==sum) {
					System.out.println("Sum found between indices "+i+" and "+j);
				}
				else {
				sum1=sum1+a[j];
				}
			}
			
		}
	}

	public static void main(String[] args) {
		int[] a= {10, 2, -2, -20, 10};
		int sum= -10;
		findSum(a, sum);
	}

}
