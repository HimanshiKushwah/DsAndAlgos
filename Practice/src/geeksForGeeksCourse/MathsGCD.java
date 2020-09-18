package geeksForGeeksCourse;

public class MathsGCD {
	public static int findGCD(int a,int b) {
		int min=Math.min(a, b);
		int res=min;
		while(res>0) {
			if(a%res == 0 && b%res == 0) {
				break;
			}

			res--;

		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(findGCD(4,6));
	}

}
