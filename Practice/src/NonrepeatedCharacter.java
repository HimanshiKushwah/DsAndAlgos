import java.util.*;
class NonrepeatedCharacter
{
public static void main(String []args)
{
	Scanner kb = new Scanner(System.in);
	System.out.println("Please Enter the string");
	String s = kb.nextLine();
    int i=0;
	for(int j=1;j<=s.length()-1;j++)
	{
      if(i!=j)
      	{
			if(s.charAt(i)==s.charAt(j))
				{
				i++;
				j=0;
				//System.out.println(s.charAt(i)+""+j);
		//System.out.println(s.charAt(i));
				}
		 else if(s.charAt(i)!=s.charAt(j)&& j==s.length()-1)
				{ 
			System.out.println("First non repeated character is "+s.charAt(i)+" and it came "+i+" times");
			break;
				}
         }
	}
}
}