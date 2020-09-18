import java.lang.Math;
import java.lang.*;
public class FindCompliment {

	public static void findCompliment(int num) {
		int temp1=(int)(Math.log(num));
		int digit=(int) (Math.floor(temp1));
		for(int i=0;i<digit;i++) {
			int temp=1<<i;
			num=num^temp;
		}
		System.out.println(num);
	}
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num=5;
		
		findCompliment(num);
	}

}
