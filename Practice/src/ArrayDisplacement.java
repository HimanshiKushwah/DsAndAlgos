import java.util.Scanner;
class ArrayDisplacement
{
	public static void main(String []args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n=kb.nextInt();
		System.out.println("Enter the Values of Array");
		int x[]=new int[n];
		int y[]=new int[n];
		int k=n,z=0;
		for(int i=0;i<=n-1;i++)
		{
			x[i]=kb.nextInt();

			if(x[i]%2==0)
			{
				y[z]=x[i];
				z++;
			}
			if(x[i]%2==1)
			{

				for(int j=k-1;j>=0;j--)
				{
					//System.out.println("Check "+j);
					y[j]=x[i];
					break;
				}
				k--;
			}


		}
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(y[i]+" ");
		}
	}

}