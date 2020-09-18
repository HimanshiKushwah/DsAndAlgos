import java.util.Scanner;
class RemoveDuolicateChar_StfromToNd
{
public static void main(String []args)
{
	Scanner kb = new Scanner(System.in);
	System.out.println("Please Enter the First string");
	String s = kb.nextLine();
	System.out.println("Please Enter the Second string");
	String r = kb.nextLine();
	for(int j=0;j<=r.length()-1;j++)
	{

		for(int i=0;i<=s.length()-1;i++)
		{
		 if(r.charAt(j)==s.charAt(i))
		 {
				 String S2=String.valueOf(s.charAt(i));
				 s = s.replace(S2,"");
			 }
		 }

	}

System.out.println(s);
}
}