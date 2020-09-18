
public class PerfectSquareUsingBinarySearch {
	public static boolean perfectSquare(int num) {
		int l=0;
		int r=num;
		while(l<=r) {
			int mid=l+((r-l)>>1);
			long sq=(mid*mid);
			if(sq==num) {
				return true;
			}
			else if(sq<num) {
				l=mid+1;
			}
			else {
				r= mid-1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int num=12;
		System.out.println(perfectSquare(num));
	}

}
//O(logn)   