import java.util.Scanner;
class OccurenceOfCharacter
{
public static void main(String []args)
{

	Scanner kb = new Scanner(System.in);
	System.out.println("Please Enter the No. Of string u Wants to Enter");
	String s = kb.nextLine();
	String n = kb.nextLine();
	int i=0,k=0;
	for(int j=0;j<=s.length()-1;j++)
	{
		if(n.charAt(i)==s.charAt(j))
			{

				k++;


		//System.out.println(s.charAt(i));
		}
	}
	System.out.println(k);

}
}