import java.util.Scanner;
class Check_1stReverseOf_2ndString
{
public static void main(String []args)
{
	Scanner kb = new Scanner(System.in);
	System.out.println("Please Enter the First string");
	String s = kb.nextLine();
	System.out.println("Please Enter the Second string");
	String r = kb.nextLine();
	String reverse="";
	for(int j=r.length()-1;j>=0;j--)
	{
		reverse=reverse+r.charAt(j);
		//System.out.println(reverse);
		}
		 if(reverse.equals(s))
		 {
			System.out.println("Both Strings are Reverse of each other "+r);

			}
			else
			{
				System.out.println("Both Strings are not Reverse of each other "+r);
				}
}
}