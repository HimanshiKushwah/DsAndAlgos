import java.util.Scanner;
class Print_Duplicate_Character_Ankit
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please Enter the a string");
		String s = kb.nextLine();
		for(int j=0;j<s.length();j++)
		{
			int k=0,i;
			for(i=0;i<s.length();i++)
			{
				if(s.charAt(j)==s.charAt(i))
				{
					k++;
				}
			}
			char n=s.charAt(j);
			if(k>=2 && i>=s.length()-1)
			{
				for(int x=0;x<s.length()-1;x++)
				{
					if(n==s.charAt(x))
					{
						String S2=String.valueOf(n);
						System.out.print(S2);
						s = s.replace(S2,"");
					}
				}

			}

		}

		System.out.println("");
	}
}	