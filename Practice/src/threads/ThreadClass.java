package threads;

class A implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println("Thread A "+i);
		}
	}
}
class B implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println("Thread B "+i);
		}
	}
}

public class ThreadClass
{
	public static void main(String[] args)
	{
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		System.out.println("this is how RAM Do its work time Displacement ");
		t1.start();
		t2.start();
	}
}