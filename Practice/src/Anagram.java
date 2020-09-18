import java.util.Scanner;
//how to check if two String are anagram

public class Anagram {
	public static void anagram(String s1,String s2) {
		String s1Upper= s1.toUpperCase();
		String s2Upper= s2.toUpperCase();
		int sum1=0,sum2=0;
		
		for(int i=0;i<s1Upper.length();i++) {
			sum1=sum1+s1Upper.charAt(i);
		}
		for(int j=0;j<s2Upper.length();j++) {
			sum2=sum2+s2Upper.charAt(j);
		}
		if(sum1==sum2) {
			System.out.println("Its is an Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String 1:-");
		String s1=sc.nextLine();
		System.out.print("Enter the String 2:-");
		String s2=sc.nextLine();
		anagram(s1,s2);

	}

}
