package ravibraRabulaDS;

//Find the index in an array such that the sum of elements at lower indices is equal to the sum of elements at higher indices.

public class EquilibriumIndex {
	public static int findIndex(int[] a,int l,int h) {
		int mid=l+((h-l)>>1); 
		int sumLeft=0,sumRight=0;

		for(int i=0;i<mid;i++) {
			sumLeft+=a[i];
		}
		for(int i=mid+1;i<h;i++) {
			sumRight+=a[i];
		}
		if(sumLeft == sumRight) {
			return mid;
		}
		else {
			return -1;
		}
	}
//	public static int find(int[] a,int l,int h) {
//		
//		if(h-l==1) {
//			return -1;
//		}
//		int mid=l+((h-l)>>1); 
//		int sumLeft=0,sumRight=0;
//		sumLeft= find(a, 0, mid);
//		sumRight= find(a, mid+1,h-1);
//		if(sumLeft == sumRight) {
//			return mid;
//		}else {
//		return -1;
//		}
//	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,3,2,1};
		int[] a1= {-7,1,5,2,-4,3,0};
		int h= a.length;
		int h1= a1.length;
		System.out.println(findIndex(a1,0,h));
//		System.out.println(find(a1,0,h1));

	}

}
