import java.util.Scanner;
//Write a method which will remove any given character from a string.
public class RemoveCharacter {

	public static void removeCharacter(String s,String c) {
		String commonStr="";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<c.length();j++) {
				if(s.charAt(i)!=c.charAt(j)) {
					commonStr+=s.charAt(i);
				}
			}
		}
		System.out.println("Original String:- "+s);
		System.out.println("String after removing "+c+":- "+commonStr);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String:-");
		String s= sc.nextLine();
		System.out.print("Enter the Character that you want to remove from the above string:-");
		String c=sc.nextLine();

		removeCharacter(s,c);

	}

}
