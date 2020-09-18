import java.util.Scanner;

public class Test12 {
	static boolean str[] = new boolean[256];
	static String s1=" ";
	
	public static void AddEven(String s) {
		int i=0;
		for(i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count%2==0) {
				str[s.charAt(i)]=true;
			}
			System.out.println(str[s.charAt(i)]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		
		String s=sc.nextLine();
		AddEven(s);
	}

}
