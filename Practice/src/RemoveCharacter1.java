import java.util.Scanner;
class RemoveCharacter1
{
	public static void main(String []args)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Please enter the String");
			String s=kb.nextLine();
			System.out.println("Please enter the Character ");
			String c=kb.nextLine();
			int j=0;
			for(int i=0;i<=s.length()-1;i++)
				{
					if(c.charAt(j)==s.charAt(i))
					{
						continue;
					}
					else
					{
						System.out.print(s.charAt(i));
					}
				}
		}
}