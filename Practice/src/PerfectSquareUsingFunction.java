
public class PerfectSquareUsingFunction {
	public static boolean perfectSquare(int num) {
		double result=Math.floor(Math.sqrt(num));
		double result1=Math.ceil(Math.sqrt(num));
		if(result==result1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int num=14;
		System.out.println(perfectSquare(num));
	}

}
