package practice;

public class Segregate {

	public static void main(String[] args) {
		int[] a= { 1,1,0,0,1,1};
		
		int i=0;
		int temp = a[i];
		for(int j=i+1;j<a.length;j++) {
			if(a[j]== temp) {
				a[i+1]=a[j]^a[i+1];
				a[j]=a[j]^a[i+1];
				a[i+1]=a[j]^a[i+1];
				i++;
			}
		}
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}

}
