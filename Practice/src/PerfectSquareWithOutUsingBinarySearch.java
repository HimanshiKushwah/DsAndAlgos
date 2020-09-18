//Given a positive integer num, write a function which returns True if num is a perfect square else False.
public class PerfectSquareWithOutUsingBinarySearch {
	public static boolean perfectSquare(int num) {
		int i=0;
		for(i=0;i*i<=num;i++) {
			int square=i*i;
			if(square==num) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {

		int num=14;
		System.out.println(perfectSquare(num));
	}

}
