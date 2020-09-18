package ravibraRabulaDS;

public class Segregate1And0 {
	public static void segregate(int[] a) {
		int i=0;
			
			int temp=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(temp==a[j]) {
					a[i+1]=a[i+1]^a[j];
					a[j]=a[i+1]^a[j];
					a[i+1]=a[i+1]^a[j];
					i++;
					
				}
				
			}
		
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr= {0,0,0,1,1,0,1};
		segregate(arr);
	}

}
