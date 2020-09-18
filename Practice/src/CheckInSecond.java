import java.util.Scanner;
//Remove the common character present in second string from first string
public class CheckInSecond {
	public static void checkString(String s1,String s2) {
		String str="";
		
		for(int i=0;i<s1.length();i++) {
			int count=0;
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					count++;
				}
			}
			if(count==0) {
				str+=s1.charAt(i);
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first String:-");
		String s1=sc.nextLine();
		System.out.print("Enter the second string:-");
		String s2=sc.nextLine();
		checkString(s1, s2);
	}

}
