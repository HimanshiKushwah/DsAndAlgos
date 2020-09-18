import java.util.Scanner;

// how to find a first non repeated character of a given String
public class NonRepeatedCharacter {
	
    static char count[] = new char[256]; 
		public static void nonRepeat(String str) {
			for(int i=0;i<str.length();i++) {
				count[str.charAt(i)]++;
			}
		}
		
		public static void checkFirst(String str) {
			int index=0,i;
			nonRepeat(str);
			for(i=0;i<str.length();i++) {
				if(count[str.charAt(i)]==1) {
					index++;
					break;
				}
			}
			System.out.println("First non repeated character is "+"'"+str.charAt(i)+"'");
		}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String:- ");
		String s1= sc.nextLine();
		checkFirst(s1);

	}

}
