import java.util.Scanner;
class Next
{
	 void show(int n)

	{
		int rev=0,to=n,count=0;
		
		while(n!=0)
		{
			int val=n%10;
			rev=rev*10+val;
			n=n/10;
		}
		if(to!=rev)
		{ 	
			count++;
			n=to+rev;
			System.out.println("iteration "+count);
			show(n);
		}
		else
		{
			System.out.println("Palindrome "+rev);
		}
	}
}
class Palindrome1 extends Next
{

	public static void main(String []args)
	{
		Palindrome1 p=new Palindrome1();
		int n;
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter the value");
		n=kb.nextInt();
		
		p.show(n);
	}
}