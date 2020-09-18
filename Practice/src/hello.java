import java.util.Scanner;

public class hello {
	public static void area(float r,float h) {
		float result=((22*r*r*h)/7);
		System.out.println("Area of cylinder is:- "+result);
	}
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);	
	 System.out.println("Enter the radius of cylinder:");
	 float r=sc.nextFloat();
	 System.out.println("Enter the height of cylinder");
	 float h= sc.nextFloat();
	 area(r,h);
	 
	 
 }
}
