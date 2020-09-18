package geeksForGeeksCourse;

public class MathsHCF {
	
	public static int findHCF(int a,int b) {
		int res= Math.max(a, b);
			while(a!=b)
			if(res%b == 0 && res%a==0) {
				break;
			}
			else
				res++;
			
			return res;
		}
	

	public static void main(String[] args) {
		
		System.out.println(findHCF(4,8));
	}

}
