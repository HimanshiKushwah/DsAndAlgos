import java.util.Scanner;
//Print duplicates in a given string
public class DupsPrint {
	static final int NO_OF_CHARS = 256;
	 static void countDups(String s,int[] count) {
		int len=s.length();
		for(int i=0;i<len;i++) {
			count[s.charAt(i)]++;
		}
		
	}
	  static void printDups(String s) {
		 int count[]=new int[NO_OF_CHARS];
		 countDups(s, count);
		 
		for(int i=0;i< NO_OF_CHARS;i++) {
			if(count[i]>1) {
				System.out.printf("%c,  count = %d \n",i,  count[i]); 
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s= sc.nextLine();
		printDups(s);;
		}

}
