package dataStructure;

public class ReverseArray {
	public static int[] reverseArray(int[] a) {
		int len=a.length/2;
		
		if(a.length== 1) {
			return a;
		}
		else {
			for(int i=0;i<len;i++) {
				boolean swap=false;
					for(int j=a.length-1-i;j>=len;j--) {
						if(swap==false) {
						a[i]=a[i]^a[j];
						a[j]=a[i]^a[j];
						a[i]=a[i]^a[j];
						swap=true;
					}
				}
			}

			return a;
		}
	}

	public static void main(String[] args) {
		int[] a= {6676,3216,4063,8373,423,586,8850,6762};

		int [] arr=reverseArray(a);
		for(int a1:arr) {
			System.out.print(a1+" ");
		}
	}

}
