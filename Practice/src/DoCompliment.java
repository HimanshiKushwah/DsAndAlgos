public class DoCompliment {
	static void findCompliment(int num) {
		int rem[]=new int[5];
		int i=0;
		while(num>0) {
			rem[i]=num%2;
			num=num/2;
			i++;
		}	
		flip(rem);
	}
	static void flip(int[] a) {
		int temp[]= new int[a.length];
		
			for(int i=0;i<a.length;i++) {
			temp[i]=((a[i]==0) ? 1 : 0);
			}
		
		getDecimal(temp);
	}
	static void getDecimal(int[] temp) {
		int result=0;
		for(int i=0;i<temp.length;i++) {
			if(temp[i]==1) {
			 result=(int) ((int)result+ (temp[i]*Math.pow(2, i)));
			}
		}
		System.out.println(result);
 	}

	public static void main(String[] args) {
		int num=5;
		findCompliment(num);
	}

}
