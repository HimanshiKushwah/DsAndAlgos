import java.util.Scanner;
//how to count the occurence of a given character in a string
public class CharacterCount {
		public static void characterCount(String s,char c) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				
				if(s.charAt(i)==c) {
					count++;
				}
			}
			System.out.println("Character "+c+" occured " +count+ " times in a String "+s);
		}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the string:-");
		String s= sc.nextLine();
		System.out.print("Enter the character you want to find in the string:-");
		char c=sc.next().charAt(0);
		characterCount(s,c);
	}

}
