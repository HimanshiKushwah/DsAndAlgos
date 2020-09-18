import java.util.Scanner;
class BiggestPalindrome
{public static void main(String []args)
{
	String S2 ="";
	try{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please Enter the No. Of string u Wants to Enter");
		int n=kb.nextInt();


		for(int j=0;j<=n;j++)
		{
			String s = kb.nextLine();
			String reverse ="";
			for(int i=s.length()-1;i>=0;i--)
			{
				reverse=reverse+s.charAt(i);
			}
			if(s.equals(reverse))
			{
				String First=s;
				//System.out.println("First palindrome "+First);
				if(First.length()>=S2.length())
				{
					S2=First;
					//System.out.println("Second palindrome "+S2);
				}
			}
			else
			{
				System.out.println("String is not Palindrome");
			}
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("Biggest String Palindrome "+S2);
}
}